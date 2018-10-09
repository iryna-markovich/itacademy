package menu;

import operations.Operation;

public abstract class MenuCommonOperations implements MenuItem {
    private Operation operation;
    private RootMenuItem rootMenuItem;

    public MenuCommonOperations(Operation operation, RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
        this.operation = operation;
    }

    @Override
    public void execute() {
        rootMenuItem.execute();
    }
}