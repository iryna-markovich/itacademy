package by.itacademy.operation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Display<T> implements Performance<T> {
    private String[] list = new Text().getArray();
    LengthComparator<String> comparator = new LengthComparator();
    Map<String, Integer> wordAndOccurrences = new HashMap<>();
    TreeSet<String> listSet = new TreeSet<>(comparator);

    public void makeSet(String[] list) {
        for (String word : list) {
            listSet.add(word);
        }
        count(list);
    }

    public void count(String[] list) {
        for (String word : list) {
            Integer counter = wordAndOccurrences.get(word);
            if (counter == null) {
                counter = 0;
            }
            wordAndOccurrences.put(word, counter + 1);
        }
    }

    @Override
    public void execute() {
        makeSet(list);
        for (String word : listSet) {
            System.out.println(word + " " + wordAndOccurrences.get(word).intValue());
        }
    }
}
