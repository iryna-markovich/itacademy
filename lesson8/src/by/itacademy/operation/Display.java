package by.itacademy.operation;

import java.util.Set;
import java.util.TreeSet;

public class Display implements Operation {
    Text text;

    LengthComparator comparator = new LengthComparator();
    Set<String> listSet = new TreeSet<>(comparator);

    public Display(Text text) {
        this.text = text;
    }

    public void makeSet(String[] list) {
        for (String word : list) {
            listSet.add(word);
        }
        text.count(list);
    }

    @Override
    public void call() {
        String[] list = text.getText();
        makeSet(list);
        for (String word : listSet) {
            System.out.println(word + " " + text.wordAndOccurrences.get(word).intValue());
        }
    }
}
