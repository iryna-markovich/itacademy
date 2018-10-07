package by.itacademy;

import by.itacademy.apartment.Apartment;
import by.itacademy.items.Lightbulb;

import java.util.ArrayList;

public class Building extends ArrayList<Apartment> implements Adding {
    private String name;

    public Building(String name) {
        this.name = name;
    }

    @Override
    public void addApartment(String name, double area, int window) {
        super.add(new Apartment(name, area, window));
    }

    @Override
    public void addItem(int roomNumber, Lightbulb bulb) {
        super.set(roomNumber, super.add(bulb));
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(name).append("\n").append(super.toString());
        return out.toString();
    }

}

