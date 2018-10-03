package by.itacademy.operation;

import java.util.*;

public class Text<T> implements Performance<T> {
    private static final Scanner SC = new Scanner(System.in);
    String text;

    public Text() {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Write down some text:");
        this.text = SC.nextLine().toLowerCase();
    }



    String[] getArray(String text) {
        return text.split(" ");
    }

    public T getText() {
        return (T) text;
    }

    // TreeSet<String> states = new TreeSet<String>();

}
