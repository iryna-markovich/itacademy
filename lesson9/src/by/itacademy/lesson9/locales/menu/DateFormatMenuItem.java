package by.itacademy.lesson9.locales.menu;

import by.itacademy.lesson9.locales.DateFormats;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatMenuItem implements MenuItem {
    private RootMenuItem rootMenuItem;
    private Scanner scanner = new Scanner(System.in);
    private DateFormats dateFormats = new DateFormats();

    public DateFormatMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    SimpleDateFormat dateFormatFULL = new SimpleDateFormat("EEEE, dd MMMM yyyy г.", dateFormatSymbols);
    SimpleDateFormat dateFormatLONG = new SimpleDateFormat("dd MMMM yyyy г.", dateFormatSymbols);
    SimpleDateFormat dateFormatMEDIUM = new SimpleDateFormat("dd MMM yyyy г.", dateFormatSymbols);

    @Override
    public void execute() {
        StringBuilder show = new StringBuilder("Выберите тип даты: \n");
        for (int i = 0; i < dateFormats.size(); i++) {
            show.append(i + 1).append(". ").append(dateFormats.get(i)).append("\n");
        }
        System.out.print(show);
        int choice = scanner.nextInt();
        Locale locale = rootMenuItem.getLocale();
        DateFormat fmt = DateFormat.getDateInstance(choice - 1, locale);
        Date currentDate = new Date();

        if (locale.toString().equals("by")) {
            if (choice == 1) System.out.println(dateFormatFULL.format(currentDate));
            else if (choice == 2) System.out.println(dateFormatLONG.format(currentDate));
            else if (choice == 3) System.out.println(dateFormatMEDIUM.format(currentDate));
            else System.out.println(fmt.format(currentDate));
        } else System.out.println(fmt.format(currentDate));
    }

    private static DateFormatSymbols dateFormatSymbols = new DateFormatSymbols() {
        public String[] getMonths() {
            return new String[]{"Студзень", "Люты", "Сакавік", "Красавік", "Травень", "Чэрвень", "Ліпень", "Жнівень", "Верасень", "Кастрычнік", "Лістапад", "Снежань"};
        }

        public String[] getWeekdays() {
            return new String[]{"Панядзелак", "Аўторак", "Серада", "Чацвер", "Пятніца", "Субота", "Нядзеля"};
        }

        public String[] getShortMonths() {
            return new String[]{"Студ.", "Лют.", "Сак.", "Крас.", "Трав.", "Чэрв.", "Ліп.", "Жнів.", "Вер.", "Каст.", "Ліст.", "Снеж."};
        }
    };
}