package by.itacademy.operation;

import java.util.Comparator;

public class LengthComparator<T> implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}
