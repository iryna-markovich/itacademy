package menu;

import operations.Search;

public class MenuSearch extends SubMenu implements MenuItem {

    public MenuSearch(Menu menuItem) {
        super(new Search(), menuItem);
    }

    @Override
    public String getName() {
        return "Найти товар";
    }
}
