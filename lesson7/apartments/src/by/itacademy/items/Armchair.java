package by.itacademy.items;

public class Armchair {
    private String name;
    private int square;

    public Armchair(String name, int square) {
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

