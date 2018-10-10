package menu;

import java.util.Scanner;

public class Menu {
    public static final Scanner SCANNER = new Scanner(System.in);

    private SubMenu[] subMenus = {
            new MenuAddGoods(this),
            new MenuSearch(this),
            new MenuSort(this),
            new MenuCount(this),
            new MenuDeleteGoods(this)
    };

    public void run() {
        System.out.println("\nМеню магазина:");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println((i + 1) + " " + subMenus[i].getName());
        }
        subMenus[SCANNER.nextInt() - 1].run();
    }
}
