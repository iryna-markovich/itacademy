package by.itacademy.newCalculator.menu;

import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operands.OperandsTwo;
import by.itacademy.newCalculator.operations.Addition;
import by.itacademy.newCalculator.operations.Operation;
import by.itacademy.newCalculator.operations.Subtraction;

/**
 * Created by user on 9/22/2018.
 */
public class MenuSubtraction extends MenuCommonOperations implements MenuItem {
    public MenuSubtraction(RootMenuItem rootMenu) {
        super(new Subtraction(), rootMenu);
    }

    @Override
    protected int operandsCount() {
        return 2;
    }

    @Override
    protected Operands operandsType(int... abc) {
        return new OperandsTwo(abc[0], abc[1]);
    }

    @Override
    public String name() {
        return "Subtraction";
    }
}
