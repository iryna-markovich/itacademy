package by.itacademy.lesson9.menu;

public class DateFormatMenuItem implements MenuItem {
    private RootMenuItem rootMenuItem;

    public DateFormatMenuItem(RootMenuItem rootMenuItem) {
        this.rootMenuItem = rootMenuItem;
    }

    @Override
    public void execute() {
        rootMenuItem.getLocale();
        //logic
    }
}
