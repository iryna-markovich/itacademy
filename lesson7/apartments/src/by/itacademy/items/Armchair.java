package by.itacademy.items;

public class Armchair implements Item {
    String name;
    int square;

    public Armchair(String name, int square) {
        this.name = name;
        this.square = square;
    }

    @Override
    public int getParam() {
        return square;
    }

    @Override
    public String getItemName() {
        return name;
    }
}

