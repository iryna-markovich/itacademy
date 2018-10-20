package menu.menuOther;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.sort.SortByName;
import shopStructure.Shop;

public class MenuAddGoods extends SubMenu implements MenuItem {

    public MenuAddGoods(Shop shop, Menu menuItem) {
        super(new SortByName(shop), menuItem);
    }

    @Override
    public String getName() {
        return "Добавить товар";
    }
}
