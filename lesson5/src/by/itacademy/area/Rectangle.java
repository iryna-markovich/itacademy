package by.itacademy.area;

class Rectangle extends Figure {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}