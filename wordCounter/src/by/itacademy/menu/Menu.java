package by.itacademy.menu;

import java.util.Scanner;

public class Menu implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuListDisplay(),
            new MenuFindWord()
    };

    public void execute() {
        System.out.println("----------------MENU---------------");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].getName());
        }
        System.out.println("___________________________________");
        subMenus[SCANNER.nextInt()].execute();
    }
}