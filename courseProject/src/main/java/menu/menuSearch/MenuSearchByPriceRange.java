package menu.menuSearch;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.search.SearchByPriceRange;
import shopStructure.Shop;

public class MenuSearchByPriceRange extends SubMenu implements MenuItem {

    public MenuSearchByPriceRange(Shop shop, Menu menuItem) {
        super(new SearchByPriceRange(shop), menuItem);
    }

    @Override
    public String getName() {
        return "по диапазону цен";
    }
}