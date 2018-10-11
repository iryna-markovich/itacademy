package menu;

import operations.AddGoods;
import operations.Search;
import shopStructure.Shop;

public class MenuSearch extends SubMenu implements MenuItem {

    public MenuSearch(Shop shop, Menu menuItem) {
        super(new Search(shop), menuItem);
    }

    @Override
    public String getName() {
        return "Найти товар";
    }
}
