package by.itacademy.operation;

import java.util.*;

public class Text implements Performance {
    private static final Scanner SC = new Scanner(System.in);
    String text;

    public Text() {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Write down some text:");
        getText();
    }

    String getText() {
        text = SC.nextLine().toLowerCase();
        return text;
    }

    String[] toArray(String text) {
        list = text.split(" ");
        return list;
    }

    String[] list = text.split(" ");


   // TreeSet<String> states = new TreeSet<String>();

}
