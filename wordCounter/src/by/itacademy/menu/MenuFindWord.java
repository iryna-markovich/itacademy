package by.itacademy.menu;

import by.itacademy.operation.Search;

public class MenuFindWord implements MenuItem {
    @Override
    public String getName() {
        return "Find word in the text";
    }

    @Override
    public void execute() {
        new Search().execute();
        new Menu().execute();
    }
}
