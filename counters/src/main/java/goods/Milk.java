package goods;

public class Milk implements Good {
    @Override
    public String getName() {
        return "milk";
    }

    @Override
    public double getPrice() {
        return 2.3;
    }

    @Override
    public String toString() {
        return getName();
    }
}
