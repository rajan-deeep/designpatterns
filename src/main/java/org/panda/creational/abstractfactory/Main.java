package org.panda.creational.abstractfactory;

public class Main {
    Button button;
    Scrollbar scrollbar;

    public void render() {
        button.render();
        scrollbar.scroll();
    }

    public Main(UiFactory uiFactory) {
        button = uiFactory.createButton();
        scrollbar = uiFactory.createScrollbar();
    }

    public static void main(String[] args) {
        UiFactory window = new WindowUIFactory();
        Main main = new Main(new MacUIFactory());
        main.render();
    }
}
