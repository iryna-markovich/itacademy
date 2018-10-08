package by.itacademy.linkedList;

import java.util.*;

public class LinkedList<T> implements List<T> {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void add(int index, T value) {
        Node current = head;
        int currentIndex = 0;
        if (index > size) {
            throw new IndexOutOfBoundsException("Index is bigger than size");
        }
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            if (currentIndex == index) {
                head = node;
                node.next = current;
            } else {
                while (currentIndex < index - 1) {
                    current = current.next;
                    currentIndex++;
                }
                node.next = current.next;
                current.next = node;
            }
        }
        size++;
    }

    public T remove(int index) {
        Node current = head;
        int currentIndex = 0;
        Node result;
        if (index > size || head == null) {
            throw new IndexOutOfBoundsException("Index is bigger than size or list is empty");
        } else {
            while (currentIndex < index - 1) {
                current = current.next;
                ++currentIndex;
            }
            result = current.next;
            current.next = current.next.next;
        }
        size--;
        return result.value;
    }

    public boolean contains(T value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                Node next = current;
                current = current.next;
                return next.value;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (T value : this) {
            out.append(value).append(" ");
        }
        return out.toString();
    }
}

