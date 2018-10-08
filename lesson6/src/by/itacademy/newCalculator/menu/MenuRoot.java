package by.itacademy.newCalculator.menu;

import by.itacademy.newCalculator.operands.Operands;
import by.itacademy.newCalculator.operands.OperandsOne;
import by.itacademy.newCalculator.operations.Operation;
import by.itacademy.newCalculator.operations.Root;

/**
 * Created by user on 9/22/2018.
 */
public class MenuRoot extends MenuCommonOperations implements MenuItem {

    public MenuRoot(RootMenuItem rootMenu) {
        super(new Root(), rootMenu);
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
        return "Root";
    }
}
