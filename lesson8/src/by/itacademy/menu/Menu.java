package by.itacademy.menu;

import by.itacademy.operation.Text;

import java.util.Scanner;

public class Menu {
    private Text text = new Text();
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuListDisplay(text, this),
            new MenuFindWord(text, this)
    };

    public void run() {
        System.out.println("----------------MENU---------------");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].getName());
        }
        System.out.println("___________________________________");
        subMenus[SCANNER.nextInt()].run();
    }
}