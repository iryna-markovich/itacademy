package menu;

import operations.DeleteGoods;
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
