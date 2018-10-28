package by.itacademy;

import by.itacademy.exception.IlluminanceLimitException;
import by.itacademy.exception.SpaceLimitException;
import by.itacademy.items.Armchair;
import by.itacademy.items.LightBulb;
import by.itacademy.items.Table;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingName;
    private List<Apartment> building = new ArrayList<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public void addApartament(String name, int square, int window) {
        building.add(new Apartment(name, square, window));
    }

    public void add(int number, Table table) {
        building.get(number - 1).tables.add(table);
    }

    public void add(int number, LightBulb lightBulb) {
        building.get(number - 1).lightBulbs.add(lightBulb);
    }

    public void add(int number, Armchair armchair) {
        building.get(number - 1).armchairs.add(armchair);
    }

    public void info() throws IlluminanceLimitException, SpaceLimitException {
        System.out.println(buildingName);
        for (Apartment apartment : building)
            apartment.show();
    }
}

