package by.itacademy.calculator;


public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULATOR\n  + (add)\t|\t- (subtract)\t|\t* (multiply)\t|\t/ (divide)\t|\tp (power)\t|\tr (root)");
        Calculator calculator = new Calculator();
        int num1 = calculator.in();
        int num2 = calculator.in();
        char symbol = calculator.get();
        int result = calculator.resolve(num1,num2,symbol);
        System.out.println(result);
    }
}

