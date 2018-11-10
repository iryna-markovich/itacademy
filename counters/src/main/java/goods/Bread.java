package goods;

public class Bread implements Good {
    @Override
    public String getName() {
        return "bread";
    }

    @Override
    public double getPrice() {
        return 3.5;
    }

    @Override
    public String toString() {
        return getName();
    }
}
