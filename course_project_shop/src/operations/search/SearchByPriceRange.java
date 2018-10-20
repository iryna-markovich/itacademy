package operations.search;

import operations.Operation;
import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Scanner;
import java.util.Set;

public class SearchByPriceRange implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop;

    public SearchByPriceRange(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Set<Goods> goodsList = shop.getGoodsList();
        System.out.println("Введите два числа товара: ");
        int toSearchFirstNumber = SCANNER.nextInt();
        int toSearchLastNumber = SCANNER.nextInt();
        if (toSearchFirstNumber > toSearchLastNumber) {
            int temp = toSearchFirstNumber;
            toSearchFirstNumber = toSearchLastNumber;
            toSearchLastNumber = temp;
        }
        shop.showTableHead();
        for (Goods item : goodsList) {
            int result = item.getPrice();
            if (result >= toSearchFirstNumber && result <= toSearchLastNumber) item.getString();
            else System.out.println("Нет такого товара");
        }
    }
}