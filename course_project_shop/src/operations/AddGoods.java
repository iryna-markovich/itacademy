package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;

public class AddGoods implements Operation {
    private Shop shop;

    public AddGoods(Shop shop) {
        this.shop = shop;
    }

    private int counter = 1;

    @Override
    public void call() {
        Map<Long, Goods> goodsList = shop.getGoodsList();
        System.out.println("Товар добавлен:");
        goodsList.put(0L + counter, new Goods("something" + counter, true, 45));
        shop.showGoods();
        counter++;
    }
}
