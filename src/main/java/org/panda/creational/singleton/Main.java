package org.panda.creational.singleton;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the connection pool instance
            DatabaseConnectionPool connectionPool = DatabaseConnectionPool.getInstance();

            // Borrow a connection from the pool
            Connection connection = connectionPool.getConnection();
            Connection connection2 = connectionPool.getConnection();

            // Use the connection (e.g., perform database operations)
            System.out.println("Using connection: " + connection);
            System.out.println("Using connection: " + connection2);
            connectionPool.releaseConnection(connection);
            Connection connection3 = connectionPool.getConnection();
            System.out.println("Using connection: " + connection3);

            // Release the connection back to the pool
            connectionPool.releaseConnection(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
