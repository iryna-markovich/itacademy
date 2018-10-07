package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;

import java.util.logging.Logger;

public class Multiplication implements Operation {
//    private Logger logger;
//
//    public Multiplication() {
//        logger = new ConsoleLogger();
//    }

    @Override
    public int calc(Operands operands) {
        try {
            return operands.getNum(8) * operands.getNum(1);
        } catch (OperandsBoundsException e) {
            System.out.println(e.getMessage() + " Check class " + Multiplication.class.getName());
            return 0;
        }
    }
}
