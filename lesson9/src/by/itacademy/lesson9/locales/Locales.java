package by.itacademy.lesson9.locales;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Locales {
    private List<Locale> locales = new ArrayList<>();

    {
        locales.add(new Locale("by"));
        locales.add(new Locale("ru"));
        locales.add(new Locale("en"));
    }

    public List<Locale> get() {
        return locales;
    }
}
