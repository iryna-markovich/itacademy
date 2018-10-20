package menu;

import menu.menuSearch.MenuSearchByName;
import menu.menuSearch.MenuSearchByPriceRange;
import menu.menuSort.MenuSortByName;
import menu.menuSort.MenuSortByPrice;
import shopStructure.Shop;

import java.util.Scanner;

public class Menu {
    //public static final Logger LOGGER = Logger.getLogger(Menu.class.getName());
    public static final Scanner SCANNER = new Scanner(System.in);
    private Shop shop = new Shop();

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
        System.out.println("\nМеню магазина:");
        for (int i = 0; i < subMenu.length; i++) {
            System.out.println((i + 1) + " " + subMenu[i].getName());
        }
        subMenu[SCANNER.nextInt() - 1].run();

//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.getCause();
//            LOGGER.log(Level.INFO, e.getMessage(), e);
    }
}
