package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;


public class Exponent implements Operation {
    //    private Logger logger;
//    public Exponent() {
//        logger = new ConsoleLogger();
//    }
    @Override
    public int calc(Operands operands) {
        try {
            return (int) Math.exp(operands.getNum(0));
        } catch (OperandsBoundsException e) {
            System.out.println(e.getMessage() + " Check class " + Exponent.class.getName());
            return 0;
        }
    }
}
