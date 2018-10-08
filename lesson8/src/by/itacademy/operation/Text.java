package by.itacademy.operation;

import java.util.Scanner;

public class Text{
    private static final Scanner SC = new Scanner(System.in);

    private String text;

    public Text() {
        System.out.println("Write down some text:");
        this.text = SC.nextLine();
    }

    String[] getArray() {
        return text.split(" ");
    }
}


