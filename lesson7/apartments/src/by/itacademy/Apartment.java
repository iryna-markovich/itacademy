package by.itacademy;

import by.itacademy.exception.IlluminanceLimitException;
import by.itacademy.exception.SpaceLimitException;
import by.itacademy.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    String name;
    int square;
    int window;
    List<Item> apartament = new ArrayList<>();

    public Apartment(String name, int square, int window) {
        this.name = name;
        this.square = square;
        this.window = window;
    }

    int lightBulbIllumination0() {
        if (apartament.size() == 0) {
            return 0;
        }
        return apartament.get(0).getParam();
    }

    int lightBulbIllumination1() {
        if (apartament.size() == 0) {
            return 0;
        }
        return apartament.get(1).getParam();
    }

    int summaryIllumination() throws IlluminanceLimitException {
        int summaryIllumination = window * 700 + lightBulbIllumination0() + lightBulbIllumination1();
        if (summaryIllumination < 300) {
            throw new IlluminanceLimitException();
        } else if (summaryIllumination > 4000) {
            throw new IlluminanceLimitException();
        }
        return summaryIllumination;
    }

    int SquareArmchair() {
        return (apartament.size() == 0) ? 0 : apartament.get(2).getParam();
    }

    int SquareTable() {
        return (apartament.size() == 0) ? 0 : apartament.get(3).getParam();
    }

    int occupiedSpace() {
        int occupiedSpace = SquareArmchair() + SquareTable();
        return occupiedSpace;
    }

    int getPartition() throws SpaceLimitException {
        int part = (int) (((double) (square - occupiedSpace()) / square) * 100);
        if (part < (100 - 70)) {
            throw new SpaceLimitException("");
        }
        return part;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(name + "\n");
        try {
            if (apartament.size() > 0) {
                info.append("Освещённость = ").append(summaryIllumination()).append("(").append(window).append(" окна по 700 лк, лампочки ").append(lightBulbIllumination0()).append(" лк и ").append(lightBulbIllumination1()).append(" лк)")
                        .append("\nПлощадь = ").append(square).append(" м^2 (занято ").append(occupiedSpace()).append(" м^2, свободно ").append(square - occupiedSpace()).append(" м^2 или ").append(getPartition()).append(" % площади)")
                        .append("\nМебель:\n")
                        .append(apartament.get(2).getItemName()).append(" (площадь ").append(apartament.get(2).getParam()).append(" м^2)").append("\n")
                        .append(apartament.get(3).getItemName()).append(" (площадь ").append(apartament.get(3).getParam()).append(" м^2)");
            } else {
                info.append("Освещённость = ").append(summaryIllumination()).append("(").append(window).append(" окна по 700 лк)")
                        .append("\nПлощадь = ").append(square).append(" м^2 (свободно ").append(getPartition()).append(" % площади)")
                        .append("\nНет мебели");
            }
        } catch (IlluminanceLimitException e) {
            e.printStackTrace();
        } catch (SpaceLimitException e) {
            e.printStackTrace();
        }
        return info.toString();
    }
}
