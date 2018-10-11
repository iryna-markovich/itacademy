package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;
import java.util.Scanner;

public class Search implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop;

    public Search(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Map<Long, Goods> goodsList = shop.getGoodsList();
        System.out.println("Какой товар нужно найти?");
        long toSearch = SCANNER.nextLong();
        Goods item = goodsList.get(toSearch);
        if (goodsList.containsKey(toSearch)) {
            System.out.printf("%-10s%-15s%-15s%-10s%n","ID","Name","Price","On stock");
            System.out.println("------------------------------------------------");
            System.out.printf("%-10s%-15s%-15s%-10s%n",toSearch,item.getName(),item.getPrice(), item.isVisible());
        } else {
            System.out.println("Нет такого товара");
        }
    }
}
