package by.itacademy.operation;

import java.util.Scanner;

public class Search implements Operation {
    private static final Scanner SCANNER = new Scanner(System.in);
    Text text;

    public Search(Text text) {
        this.text = text;
    }

    @Override
    public void call() {
        String[] list = text.getText();
        System.out.println("Write down the word are looking for:");
        String wordToSearch = SCANNER.next();
        text.contain(wordToSearch);
        text.count(list);
    }
}
