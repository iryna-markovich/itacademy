package by.itacademy.lesson9.locales.menu;

import java.util.ArrayList;
import java.util.List;

public class DateType {
    private List<String> dateType = new ArrayList<>();

    {
        dateType.add("SHORT");
        dateType.add("FULL");
    }

    public List<String> get() {
        return dateType;
    }
}


