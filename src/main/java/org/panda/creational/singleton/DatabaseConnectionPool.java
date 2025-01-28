package org.panda.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DatabaseConnectionPool {

    // Singleton instance
    private static DatabaseConnectionPool instance;

    // Pool of database connections
    private final BlockingQueue<Connection> connectionPool;

    private static final int INITIAL_POOL_SIZE = 2; // Number of initial connections

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    // Private constructor
    private DatabaseConnectionPool() {
        connectionPool = new LinkedBlockingQueue<>(INITIAL_POOL_SIZE);
        initializeConnectionPool();
    }

    // Get the singleton instance
    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    // Initialize the connection pool
    private void initializeConnectionPool() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            try {
                connectionPool.add(createNewConnection());
            } catch (SQLException e) {
                throw new RuntimeException("Error creating initial database connections.", e);
            }
        }
    }

    // Create a new database connection
    private Connection createNewConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Get a connection from the pool
    public Connection getConnection() throws InterruptedException {
        return connectionPool.take(); // Blocks if the pool is empty
    }

    // Return a connection to the pool
    public void releaseConnection(Connection connection) {
        if (connection != null) {
            connectionPool.offer(connection);
        }
    }
}

