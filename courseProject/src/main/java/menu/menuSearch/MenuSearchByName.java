package menu.menuSearch;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.search.SearchByName;
import shopStructure.Shop;

public class MenuSearchByName extends SubMenu implements MenuItem {

    public MenuSearchByName(Shop shop, Menu menuItem) {
        super(new SearchByName(shop), menuItem);
    }

    @Override
    public String getName() {
        return "по имени";
    }
}