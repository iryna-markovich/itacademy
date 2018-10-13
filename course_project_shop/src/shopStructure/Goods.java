package shopStructure;

public class Goods {
    private String name;
    private boolean visibility;
    private int price;

    public Goods(String name, boolean visibility, int price) {
        this.name = name;
        this.visibility = visibility;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isVisible() {
        return visibility;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("\tName: ").append(name).append("\tPrice: ").append(price).append("\tOn stock: ").append(visibility);
        return info.toString();
    }

}

