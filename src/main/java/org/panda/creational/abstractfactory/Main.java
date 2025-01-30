package org.panda.creational.abstractfactory;

public class Main {
    Button button;
    Scrollbar scrollbar;

    public void render() {
        button.render();
        scrollbar.scroll();
    }

    public Main(UiFactory uiFactory) {
        //here main class doesn't know which UIfactory concreate implementation will come but code works for all
        button = uiFactory.createButton();
        scrollbar = uiFactory.createScrollbar();
    }

    public static void main(String[] args) {
        UiFactory window = new WindowUIFactory();
        Main main = new Main(new MacUIFactory());
        main.render();
    }
}
