package by.itacademy.area;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private double angle;

    public Triangle(int angle, int sideA, int sideB) {
        this.angle = angle;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return (sideA * sideB * Math.sin(angle)) / 2;
    }
}
