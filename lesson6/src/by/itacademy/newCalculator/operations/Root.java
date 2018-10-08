package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;

public class Root implements Operation {
    public int calc(Operands operands) {
        try {
            return (int) Math.sqrt(operands.getNum(0));
        } catch (OperandsBoundsException e) {
            System.out.println(e.getMessage() + " Check class " + Root.class.getName());
            return 0;
        }
    }
}
