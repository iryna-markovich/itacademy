package by.itacademy.area;

public class Circle extends Figure {
    private final float P = 3.14f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * P;
    }
}
