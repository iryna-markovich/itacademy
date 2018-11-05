package by.itacademy;

import java.util.*;

public class NameGenerator implements RandomGenerator<String> {
    String[] names = {"Авдей", "Аверкий", "Авксентий", "Агафон",
            "Александр", "Алексей", "Альберт", "Альвиан",
            "Анатолий", "Андрей", "Антон", "Антонин",
            "Анфим", "Аристарх ", "Аркадий", "Арсений",
            "Артём", "Артур", "Архипп", "Афанасий"};

    @Override
    public String execute() {
        return names[new Random().nextInt(names.length - 1)];
    }
}