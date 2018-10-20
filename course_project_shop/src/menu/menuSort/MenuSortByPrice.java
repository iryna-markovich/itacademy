package menu.menuSort;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.sort.SortByPrice;
import shopStructure.Shop;

public class MenuSortByPrice extends SubMenu implements MenuItem {

    public MenuSortByPrice(Shop shop, Menu menuItem) {
        super(new SortByPrice(shop), menuItem);
    }

    @Override
    public String getName() {
        return "сортировка по цене";
    }
}
