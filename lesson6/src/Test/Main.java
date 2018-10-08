package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        boolean done = false;
        System.out.println("Enter number");
        while (!done){
            try {
                Scanner IN = new Scanner(System.in);
                num1 = IN.nextInt();
                System.out.println("Your first number is " + num1);
                done = true;
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("It`s not a number");
            }
        }
        System.out.println("Enter another number");
    }
}
