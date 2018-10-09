package menu;

import java.util.Scanner;

public class MenuDisplay implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuAddGoods(this),
            new MenuSearch(this),
            new MenuSort(this),
            new MenuStatistics(this),
    };

    @Override
    public void execute() {
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].name());
        }
        subMenus[SCANNER.nextInt()].execute();
    }
}
