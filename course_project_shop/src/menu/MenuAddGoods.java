package menu;

import operations.AddGoods;
import operations.Operation;
import shopStructure.Shop;

public class MenuAddGoods extends SubMenu implements MenuItem {

    public MenuAddGoods(Shop shop, Menu menuItem) {
        super(new AddGoods(shop), menuItem);
    }

    @Override
    public String getName() {
        return "Добавить товар";
    }
}
