package by.itacademy.operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Search<T> implements Performance<T> {
    private static final Scanner SC = new Scanner(System.in);
    private String[] list = new Text().getArray();
    private String wordToSearch;
    Map<String, Integer> wordAndOccurrences = new HashMap<>();

    public void count(String[] list) {
        for (String word : list) {
            Integer counter = wordAndOccurrences.get(word);
            if (counter == null) {
                counter = 0;
            }
            wordAndOccurrences.put(word, counter + 1);
        }
        contain();
    }

    void contain() {
        if (wordAndOccurrences.containsKey(wordToSearch)) {
            System.out.println("The word *" + wordToSearch.toUpperCase() + "* you are looking for occures " + wordAndOccurrences.get(wordToSearch) + " times");
        } else {
            System.out.println("There is no occurrences");
        }
    }

    @Override
    public void execute() {
        System.out.println("Write down the word are looking for:");
        wordToSearch = SC.next();
        count(list);
    }
}
