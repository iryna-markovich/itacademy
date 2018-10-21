package by.itacademy.items;

public class Table implements Item {
    private String name;
    private int square;

    public Table(String name, int square) {
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

