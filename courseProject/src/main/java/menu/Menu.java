package menu;

import menu.menuSearch.MenuSearchByName;
import menu.menuSearch.MenuSearchByPriceRange;
import menu.menuSort.MenuSortByName;
import menu.menuSort.MenuSortByPrice;
import shopStructure.Shop;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    public static final Logger LOGGER = Logger.getLogger(Menu.class.getName());
    public static final Scanner SCANNER = new Scanner(System.in);
   // public static Shop shop;
    public static Shop shop = new Shop();

    private SubMenu[] subMenu = {
            //"Найти товар"
            new MenuSortByName(shop, this),
            new MenuSortByPrice(shop, this),
            //"Показать товары"
            new MenuSearchByName(shop, this),
            new MenuSearchByPriceRange(shop, this),

            // new MenuAddGoods(shop, this),
            // new MenuCount(shop, this),
            // new MenuDeleteGoods(shop, this),
            /*
            "Статистика и поиск"
            Товары, поступившие в течение последней недели
            Поиск похожих товаров для выбранного
            Вывод средних оценок производителей
            */
    };

    public Shop getShop() {
        return shop;
    }

    public void run() {
        StringBuilder menu = new StringBuilder("\nМеню магазина:\n");
        for (int i = 0; i < subMenu.length; i++) {
            menu.append(i + 1).append(" ").append(subMenu[i].getName()).append("\n");
        }
        System.out.print(menu);
        try {
            subMenu[SCANNER.nextInt() - 1].run();
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException | NullPointerException e) {
            // something wrong with InputMismatchException running with text input
            LOGGER.log(Level.INFO, e.getMessage());
            subMenu[SCANNER.nextInt() - 1].run();
        }
    }
}