package by.itacademy;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateGenerator implements RandomGenerator<Date> {
    @Override
    public Date execute() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        int days = new Random().nextInt(10);
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
}
