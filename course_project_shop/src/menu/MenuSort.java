package menu;

import operations.Search;
import operations.Sort;
import shopStructure.Shop;

public class MenuSort extends SubMenu implements MenuItem {

    public MenuSort(Shop shop, Menu menuItem) {
        super(new Sort(shop), menuItem);
    }

    @Override
    public String getName() {
        return "Отсортировать товары";
    }
}
