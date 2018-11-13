package domain.goods;

public class Butter implements Good {
    @Override
    public String getName() {
        return "butter";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }

    @Override
    public String toString() {
        return getName();
    }
}
