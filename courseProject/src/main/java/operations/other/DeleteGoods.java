package operations.other;

import operations.Operation;
import shopStructure.Good;
import shopStructure.Shop;

import java.util.Scanner;
import java.util.Set;

public class DeleteGoods implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);
    Shop shop;

    public DeleteGoods(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Set<Good> goodList = shop.getGoodList();
        System.out.println("Какой товар нужно удалить?");
        long toDelete = SCANNER.nextLong();
        System.out.println("Tовар .......... " + toDelete + " удален");
        if (goodList.contains(toDelete)) {
            goodList.remove(toDelete);
        } else {
            System.out.println("Нет такого товара");
        }
        //shop.showGoods();
    }
}
