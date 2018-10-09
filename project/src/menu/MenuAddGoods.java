package menu;

import operations.AddGoods;

public class MenuAddGoods extends MenuCommonOperations implements MenuItem {
    public MenuAddGoods(RootMenuItem rootMenu) {
        super(new AddGoods(), rootMenu);
    }

    public void execute(){
        new AddGoods().execute();
    }

    @Override
    public String name() {
        return "Добавить товар";
    }
}
