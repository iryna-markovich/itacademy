package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;

/**
 * Created by user on 9/18/2018.
 */
public interface Operation {
        int calc(Operands operands) throws OperandsBoundsException;
}
