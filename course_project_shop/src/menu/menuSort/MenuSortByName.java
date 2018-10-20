package menu.menuSort;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.sort.SortByName;
import shopStructure.Shop;

public class MenuSortByName extends SubMenu implements MenuItem {

    public MenuSortByName(Shop shop, Menu menuItem) {
        super(new SortByName(shop), menuItem);
    }

    @Override
    public String getName() {
        return "сортировка по имени (по умолчанию)";
    }
}
