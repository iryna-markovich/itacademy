package by.itacademy.generators;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class BirthdayGenerator implements RandomGenerator<Date> {
    @Override
    public Date execute() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        int day = new Random().nextInt(10);
        int month = new Random().nextInt(12);
        int year = new Random().nextInt(1000);
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.YEAR, year);
        return cal.getTime();
    }
}
