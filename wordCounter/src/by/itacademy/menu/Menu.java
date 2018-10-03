package by.itacademy.menu;

import java.util.Scanner;

public class Menu implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuListDisplay(this),
            new MenuFindWord(this)
    };

    public void execute() {
        new MenuText().execute();
        System.out.println("___________________________________");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].getName());
        }
        subMenus[SCANNER.nextInt()].execute();
    }
}