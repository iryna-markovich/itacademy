package by.itacademy.lesson9.locales.menu;

import java.util.List;
import java.util.Scanner;

public class DateFormatMenuItem implements MenuItem {
    private RootMenuItem rootMenuItem;
    private DateType dateType = new DateType();
    private Scanner scanner = new Scanner(System.in);
    CurrentDate currentDate = new CurrentDate();

    public DateFormatMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public void execute() {
        rootMenuItem.getLocale();
        StringBuilder dateMenu = new StringBuilder("Выберите формат даты:\n");
        List<String> datesFormat = this.dateType.get();
        for (int i = 1; i <= datesFormat.size(); i++) {
            dateMenu.append(i).append(". ").append(datesFormat.get(i - 1)).append('\n');
        }
        System.out.println(dateMenu.toString());

        int choice = scanner.nextInt();
        System.out.println(currentDate.getDateFormat(choice - 1));

    }
}