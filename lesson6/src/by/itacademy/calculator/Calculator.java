package by.itacademy.calculator;

import java.util.Scanner;

public class Calculator implements Insert, Operator, OperationOld {
    private static final Scanner SC = new Scanner(System.in);
    int num;

    @Override
    public int in() {
        try {
            num = SC.nextInt();
            if(!SC.hasNext()){
                throw new CalculatorException("Something goes wrong");
            }
        } catch (CalculatorException e) {
            System.out.println(e.getMessage());
        }
        return num;
    }

    @Override
    public char get() {
        char symbol;
        if (SC.hasNext()) {
            symbol = SC.next().charAt(0);
        } else {
            SC.next();
            symbol = get();
        }
        return symbol;
    }

    public int resolve(int num1, int num2, char symbol) {
        if (symbol == '*') {
            return num1 * num2;
        }
        if (symbol == '/') {
            return num1 / num2;
        }
        if (symbol == '+') {
            return num1 + num2;
        }
        if (symbol == '-') {
            return num1 - num2;
        }
        if (symbol == 'r') {
            return num1 * num2;
        }
        if (symbol == 'p') {
            return num1 * num2;
        }else return 0;
    }
}
