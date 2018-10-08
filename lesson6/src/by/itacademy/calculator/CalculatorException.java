package by.itacademy.calculator;

public class CalculatorException extends RuntimeException {

    public CalculatorException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Something goes wrong";
    }

}
