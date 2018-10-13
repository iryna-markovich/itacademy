package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;

public class Sort implements Operation {
    Shop shop;

    public Sort(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Map<Long, Goods> goodsList = shop.getGoodsList();

        shop.showGoods();

    }
}
