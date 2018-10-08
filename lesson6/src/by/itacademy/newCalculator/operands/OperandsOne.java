package by.itacademy.newCalculator.operands;

/**
 * Created by user on 9/18/2018.
 */
public class OperandsOne implements Operands{
    private int num1;

    public OperandsOne(int num1) {
        this.num1 = num1;
    }

    public int getNum(int index) {
        return num1;
    }
}
