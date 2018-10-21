package by.itacademy;

import java.util.Random;

public class IntGenerator implements RandomGenerator<Integer> {

    @Override
    public Integer execute() {
        return new Random().nextInt(100);
    }

}