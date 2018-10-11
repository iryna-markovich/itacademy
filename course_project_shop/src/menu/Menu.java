package menu;

import shopStructure.Shop;

import java.util.Scanner;

public class Menu {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop = new Shop();

    private SubMenu[] subMenus = {
            new MenuAddGoods(shop, this),
            new MenuSearch(shop, this),
            new MenuSort(shop, this),
            new MenuCount(shop, this),
            new MenuDeleteGoods(shop, this)
    };

    public Shop getShop() {
        return shop;
    }

    public void run() {
        System.out.println("\nМеню магазина:");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println((i + 1) + " " + subMenus[i].getName());
        }
        subMenus[SCANNER.nextInt() - 1].run();
    }
}
