package by.itacademy.area;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 15);
        Square square = new Square(5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(53, 6, 10);
        rectangle.output();
        square.output();
        circle.output();
        triangle.output();
    }
}
