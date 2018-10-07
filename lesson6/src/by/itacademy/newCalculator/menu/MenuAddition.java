package by.itacademy.newCalculator.menu;

import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operands.OperandsTwo;
import by.itacademy.newCalculator.operations.Addition;

public class MenuAddition extends MenuCommonOperations implements MenuItem {

    public MenuAddition(RootMenuItem rootMenu) {
        super(new Addition(), rootMenu);
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
        return "Addition";
    }

}
