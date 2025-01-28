package org.panda.behavioural.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Observer deskTopObserver = new DeskTopObserver();
        Observer mobileObserver = new MobileObserver();
        List<Observer> observerList = new ArrayList<>();
        observerList.add(mobileObserver);
        observerList.add(deskTopObserver);

        Subject subject = new WeatherStation(observerList);
        subject.notifyAll("26 `C");
        deskTopObserver.remove(subject);
        subject.notifyAll("19 `C");

        Observer tvObserver = new TvObserver();
        observerList.add(tvObserver);
        subject.notifyAll("20 `C");
    }
}
