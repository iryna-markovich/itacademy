package by.itacademy.newCalculator;

import by.itacademy.exceptions.IndexBoundsException;
import by.itacademy.newCalculator.operands.OperandsOne;
import by.itacademy.newCalculator.operands.OperandsTwo;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IndexBoundsException, IOException {
        new Calculator().execute();
    }
}
