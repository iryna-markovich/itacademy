package Locale.menu;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class RootMenu {
    private Locales locales = new Locales();
    private static final Scanner SCANNER = new Scanner(System.in);
    private MenuItem next = new DateFormatMenu();

    public void execute() {
        System.out.println("Выберите нужную локаль: \n");
        List<Locale> locales = this.locales.get();
        StringBuilder show = new StringBuilder();
        for (int i = 0; i <= locales.size() - 1; i++) {
            show.append(i).append(". ").append(locales.get(i)).append("\n");
        }
        System.out.println(show.toString());
        int choice = SCANNER.nextInt();
        Locale locale = locales.get(choice - 1);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("resource", locale);
        System.out.println(resourceBundle.getString("hello"));

        next.execute();
    }
}
