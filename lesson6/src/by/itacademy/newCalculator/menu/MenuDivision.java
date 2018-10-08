package by.itacademy.newCalculator.menu;

import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operands.OperandsOne;
import by.itacademy.newCalculator.operands.OperandsTwo;
import by.itacademy.newCalculator.operations.Addition;
import by.itacademy.newCalculator.operations.Division;
import by.itacademy.newCalculator.operations.Operation;

/**
 * Created by user on 9/22/2018.
 */
public class MenuDivision extends MenuCommonOperations implements MenuItem {
    public MenuDivision(RootMenuItem rootMenu) {
        super(new Division(), rootMenu);
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
        return "Division";
    }
}
