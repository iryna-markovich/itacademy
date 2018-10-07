package by.itacademy.arrayList;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<T> implements List<T> {
    public static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int index = 0;

    public ArrayList() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (array.length < index) {
            T[] arrayNew = (T[]) new Object[array.length + DEFAULT_CAPACITY];
            System.arraycopy(array, 0, arrayNew, 0, array.length);
            array = arrayNew;
        }
        array[index] = element;
        index++;
    }

    @Override
    public T get(int i) {
        return (T) array[i];
    }

    @Override
    public T remove(int i) {
        System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
        T[] arrayNew = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, arrayNew, 0, array.length - 1);
        array = arrayNew;
        return (T) array;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < size() - 1;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }
}

