package by.itacademy.newCalculator.operations;

import by.itacademy.exceptions.OperandsBoundsException;
import by.itacademy.newCalculator.operands.Operands;


public class Division implements Operation {
    //    private Logger logger;
//    public Division() {
//        logger = new ConsoleLogger();
//    }
    @Override
    public int calc(Operands operands) {
        try {
            return operands.getNum(0) / operands.getNum(1);
        } catch (OperandsBoundsException e) {
            System.out.println(e.getMessage() + " Check class " + Division.class.getName());
            return 0;
        }
    }
}
