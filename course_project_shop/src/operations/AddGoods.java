package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;

public class AddGoods implements Operation {
    private Shop shop = new Shop();
    private Map<Long, Goods> goodsList = shop.getGoodsList();
    private int counter = 1;

    @Override
    public void call() {
        System.out.println("Добавляю товар..........");
        goodsList.put(0L + counter, new Goods("something" + counter, true, 45));
        shop.showGoods();
        counter++;
    }
}
