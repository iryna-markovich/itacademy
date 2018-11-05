package by.itacademy.generators;

import java.util.Random;

public class IsDismissedGenerator implements RandomGenerator<Boolean> {
    @Override
    public Boolean execute() {
        return new Random().nextBoolean();
    }
}
