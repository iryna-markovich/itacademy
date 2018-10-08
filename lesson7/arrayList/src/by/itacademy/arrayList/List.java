package by.itacademy.arrayList;

public interface List<T> extends Iterable<T> {
    void add(T element);

    T get(int i);

    T remove(int i);

    int size();

}
