package by.itacademy.operation;

import java.util.HashMap;
import java.util.Map;

public class Display implements Performance {

    Map<String, Integer> wordAndOccurrences = new HashMap<>();
        for(String word :list){
        Integer counter = wordAndOccurrences.get(word);
        if (counter == null) {
            counter = 0;
        }
        wordAndOccurrences.put(word, counter + 1);
    }

    String wordToSearch = scanner.next();
        if (wordAndOccurrences.containsKey(wordToSearch)) {
        System.out.println("The word *" + wordToSearch.toUpperCase() +  "* you are looking for occures " + wordAndOccurrences.get(wordToSearch) + " times");
    } else {
        System.out.println("There is no occurrences");
    }

    @Override
    public void execute() {

    }

}
