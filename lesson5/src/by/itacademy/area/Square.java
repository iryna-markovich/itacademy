package by.itacademy.area;

public class Square extends Figure {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }
}