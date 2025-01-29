package org.panda.creational.abstractfactory;

public class MacScrollbar implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Scrolling mac bar");
    }
}
