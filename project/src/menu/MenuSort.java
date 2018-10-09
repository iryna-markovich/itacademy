package menu;

import operations.Sort;

public class MenuSort extends MenuCommonOperations implements MenuItem {
    public MenuSort(RootMenuItem rootMenu) {
        super(new Sort(), rootMenu);
    }

    public void execute() {
        new Sort().execute();
    }

    @Override
    public String name() {
        return "Отсортировать товары";
    }
}
