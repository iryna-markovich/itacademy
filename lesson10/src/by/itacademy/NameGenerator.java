package by.itacademy;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class NameGenerator implements RandomGenerator<String> {
    @Override
    public String execute() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        int days = new Random().nextInt(10);
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return "f";
    }
}
