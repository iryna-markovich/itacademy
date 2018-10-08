package by.itacademy.studentList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class List implements Input, AverageAge {
    public static final Scanner SC = new Scanner(System.in);
    int minutes;
    int hours;
    int days;
    int months;
    int years;
    Dateable[] list;

    List(int size) {
        list = new Person[size];
    }

    public Dateable[] getList() {
        return list;
    }

    Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public TimePeriod calc() {
     //   return calculationAverageAge.execute(list);

        Calendar calendar = Calendar.getInstance();
        years = calendar.get(Calendar.YEAR);
        months = calendar.get(Calendar.MONTH) + 1; // Note: zero based!
        days = calendar.get(Calendar.DAY_OF_MONTH);
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        return null;
    }

}
