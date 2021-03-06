package by.itacademy;

import by.itacademy.exception.IlluminanceLimitException;
import by.itacademy.exception.SpaceLimitException;
import by.itacademy.items.Armchair;
import by.itacademy.items.LightBulb;
import by.itacademy.items.Table;

public class Main {
    public static void main(String[] args) throws IlluminanceLimitException, SpaceLimitException {
        Building building = new Building("Здание 1");
        building.addApartament("Комната 1", 100, 3);
        building.addApartament("Комната 2", 100, 2);

        building.add(1, new LightBulb(150));
        building.add(1, new LightBulb(250));
        building.add(2, new LightBulb(80));
        building.add(2, new LightBulb(250));
        building.add(1, new Table("Стол", 3));
        building.add(1, new Table("Стол", 10));
        building.add(1, new Armchair("Кресло мягкое и пушистое", 10));
        building.info();
    }
}

