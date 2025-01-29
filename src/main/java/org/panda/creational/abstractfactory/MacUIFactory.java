package org.panda.creational.abstractfactory;

public class MacUIFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacScrollbar();
    }
}
