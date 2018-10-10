package menu;

import operations.AddGoods;

public class MenuAddGoods extends SubMenu implements MenuItem {

    public MenuAddGoods(Menu menuItem) {
        super(new AddGoods(), menuItem);
    }

    @Override
    public String getName() {
        return "Добавить товар";
    }
}
