package org.panda.creational.abstractfactory;

public class WindowScrollbar implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Window scrollbar");
    }
}
