package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;

public class Addition implements Operation {
    @Override
    public int calc(Operands operands) {
        try {
            return operands.getNum(0) + operands.getNum(1);
        } catch (OperandsBoundsException e) {
            System.out.println(e.getMessage() + " Check class " + Addition.class.getName());
            return 0;
        }
    }
}
