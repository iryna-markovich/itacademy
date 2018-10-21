package by.itacademy;

import by.itacademy.items.Armchair;
import by.itacademy.items.LightBulb;
import by.itacademy.items.Table;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String buildingName;

    List<Apartment> building = new ArrayList<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    void addApartament(String name, int square, int window) {
        building.add(new Apartment(name, square, window));
    }

    public void add(int number, Table table) {
        building.get(number - 1).apartament.add(table);
    }

    public void add(int number, LightBulb lightBulb) {
        building.get(number - 1).apartament.add(lightBulb);
    }

    public void add(int number, Armchair armchair) {
        building.get(number - 1).apartament.add(armchair);
    }

    public void info() {
        System.out.println(buildingName);
        for (Apartment apartment : building) {
            System.out.println(apartment);
        }
    }
}

