package by.itacademy.menu;

import by.itacademy.operation.Display;

public class MenuListDisplay implements MenuItem {
    @Override
    public String getName() {
        return "Display list of occurrences";
    }

    @Override
    public void execute() {
        new Display().execute();
        new Menu().execute();
    }
}
