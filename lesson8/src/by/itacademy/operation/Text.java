package by.itacademy.operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Text {
    private static final Scanner SCANNER = new Scanner(System.in);
    private String text;

    public Text() {
        this.text = SCANNER.nextLine();
    }

    {
        System.out.println("--------WRITE DOWN SOME TEXT-------");
    }

    public String[] getText() {
        String[] list = text.split(" ");
        return list;
    }

    Map<String, Integer> wordAndOccurrences = new HashMap<>();

    public void count(String[] list) {
        for (String word : list) {
            Integer counter = wordAndOccurrences.get(word);
            if (counter == null) {
                counter = 0;
            }
            wordAndOccurrences.put(word, counter + 1);
        }
    }

    void contain(String wordToSearch) {
        if (wordAndOccurrences.containsKey(wordToSearch)) {
            System.out.println("The word *" + wordToSearch.toUpperCase() + "* you are looking for occures " + wordAndOccurrences.get(wordToSearch) + " times");
        } else {
            System.out.println("There is no occurrences");
        }
    }
}



