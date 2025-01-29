package org.panda.creational.abstractfactory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("rendering mac button");
    }
}
