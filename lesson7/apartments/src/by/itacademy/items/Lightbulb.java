package by.itacademy.items;

public class LightBulb implements Item {
    private String name;
    private int illumination;

    public LightBulb(int illumination) {
        this.illumination = illumination;
    }

    @Override
    public int getParam() {
        return illumination;
    }

    @Override
    public String getItemName() {
        return name;
    }
}
