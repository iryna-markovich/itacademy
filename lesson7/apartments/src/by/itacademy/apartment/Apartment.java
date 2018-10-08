package by.itacademy.apartment;

import by.itacademy.items.Items;
import by.itacademy.items.Lightbulb;

import java.util.ArrayList;

public class Apartment extends ArrayList<Items> {
    String name;
    double area;
    int window;
    Lightbulb lightbulb;

    public Apartment(String name, double area, int window) {
        this.name = name;
        this.area = area;
        this.window = window;
    }

    public void add(int lightness) {
        super.add(new Lightbulb(lightness));
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(name).append("\n").append("Light = ").append(window * 700 + lightbulb.getLightness()).append(" (").append(window).append("window 700 lx, lightbulb").append(lightbulb.getLightness()).append(" lx");
        return out.toString();
    }
}
