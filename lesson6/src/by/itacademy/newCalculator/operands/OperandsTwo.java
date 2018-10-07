package by.itacademy.newCalculator.operands;

import by.itacademy.exceptions.OperandsBoundsException;

import java.util.logging.Logger;

public class OperandsTwo implements Operands {
    private int num1;
    private int num2;

    public OperandsTwo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int getNum(int index) throws OperandsBoundsException {
        if (index == 0) {
            return num1;
        } else if (index == 1) {
            return num2;
        } else {
            throw new OperandsBoundsException("Error! The index should be 0 or 1.");
        }
    }
}


