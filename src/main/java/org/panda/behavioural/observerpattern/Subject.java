package org.panda.behavioural.observerpattern;

public interface Subject {
    void notifyAll(String msg);
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
