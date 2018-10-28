package by.itacademy.items;

public class LightBulb {
    private int illumination;

    public LightBulb(int illumination) {
        this.illumination = illumination;
    }

    public int getParam() {
        return illumination;
    }

    @Override
    public String toString() {
        return illumination + " лк";
    }
}
