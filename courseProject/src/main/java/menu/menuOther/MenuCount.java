package menu.menuOther;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.other.Count;
import shopStructure.Shop;

public class MenuCount extends SubMenu implements MenuItem {

    public MenuCount(Shop shop, Menu menuItem) {
        super(new Count(shop), menuItem);
    }
    @Override
    public String getName() {
        return "Количество товаров";
    }
}
