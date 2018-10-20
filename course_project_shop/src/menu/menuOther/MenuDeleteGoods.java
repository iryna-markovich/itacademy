package menu.menuOther;

import menu.Menu;
import menu.MenuItem;
import menu.SubMenu;
import operations.other.DeleteGoods;
import shopStructure.Shop;

public class MenuDeleteGoods extends SubMenu implements MenuItem {

    public MenuDeleteGoods(Shop shop, Menu menuItem) {
        super(new DeleteGoods(shop), menuItem);
    }

    @Override
    public String getName() {
        return "Удалить товар";
    }

}
