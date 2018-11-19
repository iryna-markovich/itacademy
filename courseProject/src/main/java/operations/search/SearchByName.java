package operations.search;

import operations.Operation;
import shopStructure.Good;
import shopStructure.Shop;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchByName implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop;

    public SearchByName(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Set<Good> goodList = shop.getGoods();
        System.out.println("Введите наименование товара: ");
        String toSearchString = SCANNER.next();

        for (Good item : goodList) {
            String str = item.getName();
            Pattern pattern = Pattern.compile("(?i)(\\W|^)()(\\W|$)");
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("+");
            } else {
                System.out.println("-");
/*                int result = item.getName().compareToIgnoreCase(toSearchString);
            if (result == 0) {
                shop.showTableHead();
                item.getString();
            }*/
        }
}
        System.out.println("Нет такого товара");

    }
}
