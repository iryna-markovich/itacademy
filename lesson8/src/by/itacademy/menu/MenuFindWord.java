package by.itacademy.menu;

import by.itacademy.operation.Search;
import by.itacademy.operation.Text;

public class MenuFindWord extends Submenu implements MenuItem {

    public MenuFindWord(Text text, Menu menuItem) {
        super(new Search(text), menuItem);
    }

    @Override
    public String getName() {
        return "Find word in the text";
    }

}
