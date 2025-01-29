package org.panda.creational.abstractfactory;

public class WindowUIFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new WindowScrollbar();
    }
}
