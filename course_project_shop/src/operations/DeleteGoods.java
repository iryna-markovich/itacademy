package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;
import java.util.Scanner;

public class DeleteGoods implements Operation {
    public static final Scanner SCANNER = new Scanner(System.in);

    private Shop shop = new Shop();
    private Map<Long, Goods> goodsList = shop.getGoodsList();

    @Override
    public void call() {
        System.out.println("Какой товар нужно удалить?");
        long toDelete = SCANNER.nextLong();
        System.out.println("Удаляю товар.........." + toDelete);
        if (goodsList.containsKey(toDelete)) {
            goodsList.remove(toDelete);
        } else {
            System.out.println("Нет такого товара");
        }
        shop.showGoods();
    }
}
