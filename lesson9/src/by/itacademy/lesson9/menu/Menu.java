package by.itacademy.lesson9.menu;

public class Menu {
    private MenuItem root = new LocaleChoiceMenuItem();

    public void start() {
        root.execute();
    }
}
