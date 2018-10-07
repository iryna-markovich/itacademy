package by.itacademy.area;

abstract class Figure {
    public abstract double getArea();

    public void output() {
        System.out.println(this.getArea());
    }
}