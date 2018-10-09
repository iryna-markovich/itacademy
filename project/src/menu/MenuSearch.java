package menu;

import operations.Search;

public class MenuSearch extends MenuCommonOperations implements MenuItem {
    public MenuSearch(RootMenuItem rootMenu) {
        super(new Search(), rootMenu);
    }

    public void execute() {
        new Search().execute();
    }

    @Override
    public String name() {
        return "Поиск по товарам";
    }
}
