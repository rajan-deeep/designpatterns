package org.panda.creational.abstractfactory;

public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering window button");
    }
}
