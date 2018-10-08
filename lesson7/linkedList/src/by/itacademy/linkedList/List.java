package by.itacademy.linkedList;

public interface List<T> extends Iterable<T> {
    void add(T value);

    void add(int index, T value);

    T remove(int index);

    boolean contains(T value);

    int size();
}
