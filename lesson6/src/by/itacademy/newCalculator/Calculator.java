package by.itacademy.newCalculator;

import by.itacademy.newCalculator.menu.MenuDisplay;
import by.itacademy.newCalculator.menu.RootMenuItem;

public class Calculator {
    private RootMenuItem rootMenu = new MenuDisplay();

    public void execute() {
        rootMenu.execute();
    }

}
