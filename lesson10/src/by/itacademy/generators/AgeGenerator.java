package by.itacademy.generators;

import java.util.Random;

public class AgeGenerator implements RandomGenerator<Integer> {
    @Override
    public Integer execute() {
        return new Random().nextInt(100);
    }
}