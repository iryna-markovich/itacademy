package by.itacademy.newCalculator.menu;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operations.Operation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class MenuCommonOperations implements MenuItem {
    private static final Logger LOGGER = Logger.getLogger(MenuCommonOperations.class.getName());

    private static final Scanner SCANNER = new Scanner(System.in);

    private Operation operation;
    private RootMenuItem rootMenuItem;

    public MenuCommonOperations(Operation operation, RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
        this.operation = operation;
    }

    @Override
    public void execute() {
        int arguments[] = new int[operandsCount()];
        for (int i = 0; i < operandsCount(); i++) {
            System.out.println("Введите операнд: ");
            arguments[i] = SCANNER.nextInt();
        }

        try {
            Operands operandsTwo = operandsType(arguments);
            System.out.println(operation.calc(operandsTwo));
        } catch (OperandsBoundsException e) {
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }

        rootMenuItem.execute();
    }

    protected abstract int operandsCount();

    protected abstract Operands operandsType(int... abc);
}
