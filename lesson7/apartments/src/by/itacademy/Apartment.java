package by.itacademy;

import by.itacademy.exception.IlluminanceLimitException;
import by.itacademy.exception.SpaceLimitException;
import by.itacademy.items.Armchair;
import by.itacademy.items.LightBulb;
import by.itacademy.items.Table;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private String name;
    private int square;
    private int window;
    List<Table> tables = new ArrayList<>();
    List<Armchair> armchairs = new ArrayList<>();
    List<LightBulb> lightBulbs = new ArrayList<>();

    public Apartment(String name, int square, int window) {
        this.name = name;
        this.square = square;
        this.window = window;
    }

    public int lightBulbIllumination() {
        int summary = 0;
        for (int i = 0; i < lightBulbs.size(); i++) {
            summary += lightBulbs.get(i).getParam();
        }
        return summary;
    }

    public int summaryIllumination() throws IlluminanceLimitException {
        int summaryIllumination = window * 700 + lightBulbIllumination();
        if (summaryIllumination < 300) {
            throw new IlluminanceLimitException();
        } else if (summaryIllumination > 4000) {
            throw new IlluminanceLimitException();
        }
        return summaryIllumination;
    }

    public int SquareArmchair() {
        int summary = 0;
        for (int i = 0; i < armchairs.size(); i++) {
            summary += armchairs.get(i).getParam();
        }
        return summary;
    }

    public int SquareTable() {
        int summary = 0;
        for (int i = 0; i < tables.size(); i++) {
            summary += tables.get(i).getParam();
        }
        return summary;
    }

    public int occupiedSpace() {
        int occupiedSpace = SquareArmchair() + SquareTable();
        return occupiedSpace;
    }

    public int getPartition() throws SpaceLimitException {
        int part = (int) (((double) (square - occupiedSpace()) / square) * 100);
        if (part < (100 - 70)) {
            throw new SpaceLimitException("");
        }
        return part;
    }

    void show() throws IlluminanceLimitException, SpaceLimitException {
        System.out.print(name + "\nОсвещённость = " + summaryIllumination() + " (" + window + " по 700 лк");

        if (lightBulbs.size() > 0) {
            System.out.print(", лампочки ");
            for (int i = 0; i < lightBulbs.size(); i++) {
                if (i == lightBulbs.size() - 1) {
                    System.out.print(lightBulbs.get(i));
                } else
                    System.out.print(lightBulbs.get(i) + " и ");
            }
        } else {
            System.out.print("");
        }

        if (occupiedSpace() > 0) {
            System.out.print(")\nПлощадь = " + square + " м^2 (занято " + occupiedSpace() + " м^2, свободно " + (square - occupiedSpace()) + " м^2 или " + getPartition() + " % площади)");
        } else {
            System.out.print(")\nПлощадь = " + square + " м^2 (свободно " + getPartition() + " % площади)");
        }

        if (armchairs.size() > 0 || tables.size() > 0) {
            System.out.print("\nМебель:\n");
            for (Armchair item : armchairs) {
                System.out.print(item);
            }
            for (Table item : tables) {
                System.out.print(item);
            }
        } else {
            System.out.println("\nНет мебели");
        }
    }
}
