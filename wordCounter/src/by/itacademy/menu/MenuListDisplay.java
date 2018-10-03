package by.itacademy.menu;

import by.itacademy.operation.Display;

public class MenuListDisplay implements MenuItem {
    public MenuListDisplay(Menu menu) {
    }

    @Override
    public String getName() {
        return "Display list of occurrences";
    }

    @Override
    public void execute() {
       new Display().execute();
    }
}
