package org.panda.behavioural.observerpattern;

public class TvObserver implements Observer{

    @Override
    public void sendMessage(String msg) {
        System.out.println("TV: "+msg);
    }

    @Override
    public void add(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void remove(Subject subject) {
        subject.removeObserver(this);
    }
}
