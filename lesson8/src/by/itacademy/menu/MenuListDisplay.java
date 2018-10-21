package by.itacademy.menu;

import by.itacademy.operation.Display;
import by.itacademy.operation.Text;

public class MenuListDisplay extends Submenu implements MenuItem {

    public MenuListDisplay(Text text, Menu menuItem) {
        super(new Display(text), menuItem);
    }

    @Override
    public String getName() {
        return "Display list of occurrences";
    }

}
