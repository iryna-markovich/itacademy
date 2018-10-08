package by.itacademy.lesson9.menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class CurrentDate {
    GregorianCalendar gcalendar = new GregorianCalendar();
    private int year = gcalendar.get(Calendar.YEAR);
    private int month = gcalendar.get(Calendar.MONTH);
    private int day = gcalendar.get(Calendar.DATE);
    private LocalDate currentDate = LocalDate.of(year, month, day);
    private List<String> dateFormat = new ArrayList<>();

    {
        dateFormat.add(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        dateFormat.add(currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ENGLISH)));
    }

    public String getDateFormat(int num) {
        return dateFormat.get(num);
    }
}
