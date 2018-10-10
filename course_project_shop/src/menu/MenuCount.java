package menu;

import operations.Count;

public class MenuCount extends SubMenu implements MenuItem {

    public MenuCount(Menu menuItem) {
        super(new Count(), menuItem);
    }

    @Override
    public String getName() {
        return "Количество товаров";
    }
}
