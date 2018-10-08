package by.itacademy.newCalculator.operands;

import by.itacademy.exceptions.OperandsBoundsException;

public interface Operands {
    int getNum(int index) throws OperandsBoundsException;
}

