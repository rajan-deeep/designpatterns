package org.panda.behavioural.observerpattern;

public interface Observer {
     void sendMessage(String msg);
     void add(Subject subject);
     void remove(Subject subject);
}
