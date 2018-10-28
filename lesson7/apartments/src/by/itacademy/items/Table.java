package by.itacademy.items;

public class Table {
    private String name;
    private int square;

    public Table(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public int getParam() {
        return square;
    }

    @Override
    public String toString() {
        return name + " (площадь " + square + " м^2)\n";
    }
}

