package by.itacademy.newCalculator.menu;

import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operands.OperandsOne;
import by.itacademy.newCalculator.operations.Exponent;

/**
 * Created by user on 9/22/2018.
 */
public class MenuExponent extends MenuCommonOperations implements MenuItem {
    public MenuExponent(RootMenuItem rootMenu) {
        super(new Exponent(), rootMenu);
    }

    @Override
    protected int operandsCount() {
        return 1;
    }

    @Override
    protected Operands operandsType(int... abc) {
        return new OperandsOne(abc[0]);
    }

    @Override
    public String name() {
        return "Exponent";
    }
}
