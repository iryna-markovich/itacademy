package menu;

import operations.Sort;

public class MenuSort extends SubMenu implements MenuItem {

    public MenuSort(Menu menuItem) {
        super(new Sort(), menuItem);
    }

    @Override
    public String getName() {
        return "Отсортировать товары";
    }
}
