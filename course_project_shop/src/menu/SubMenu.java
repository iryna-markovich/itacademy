package menu;

import exceptions.ArrayIndexOutOfBoundsException;
import operations.Operation;

public abstract class SubMenu implements MenuItem {
    private Operation operation;
    private Menu menuItem;

    public SubMenu(Operation operation, Menu menuItem) {
        this.operation = operation;
        this.menuItem = menuItem;
    }

    public abstract String getName();

    public void run() throws ArrayIndexOutOfBoundsException {
        operation.call();
        menuItem.run();
    }
}
