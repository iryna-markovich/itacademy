package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;
import java.util.Scanner;

public class DeleteGoods implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop;

    public DeleteGoods(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Map<Long, Goods> goodsList = shop.getGoodsList();
        System.out.println("Какой товар нужно удалить?");
        long toDelete = SCANNER.nextLong();
        System.out.println("Tовар .......... " + toDelete + " удален");
        if (goodsList.containsKey(toDelete)) {
            goodsList.remove(toDelete);
        } else {
            System.out.println("Нет такого товара");
        }
        shop.showGoods();
    }
}
