package menu;

import operations.DeleteGoods;

public class MenuDeleteGoods extends SubMenu implements MenuItem {

    public MenuDeleteGoods(Menu menuItem) {
        super(new DeleteGoods(), menuItem);
    }

    @Override
    public String getName() {
        return "Удалить товар";
    }

}
