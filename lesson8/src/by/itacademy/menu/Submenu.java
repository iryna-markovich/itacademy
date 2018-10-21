package by.itacademy.menu;

import by.itacademy.operation.Operation;

public abstract class Submenu implements MenuItem {
    private Operation operation;
    private Menu menuItem;

    public Submenu(Operation operation, Menu menuItem) {
        this.operation = operation;
        this.menuItem = menuItem;
    }

    public abstract String getName();

    public void run() {
        operation.call();
        menuItem.run();
    }
}