package org.panda.behavioural.observerpattern;

import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observerList;

    public WeatherStation(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAll(String msg) {
        for (Observer observer : observerList) {
            observer.sendMessage("temp updated " + msg);
        }
    }
}
