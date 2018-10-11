package operations;

import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sort implements Operation {
    Shop shop;

    public Sort(Shop shop) {
        this.shop = shop;
    }

    GoodsComparator comparator = new GoodsComparator();
    Set<Goods> listSet = new TreeSet<>(comparator);

    @Override
    public void call() {
        Map<Long, Goods> goodsList = shop.getGoodsList();
        for (int i = 0; i < goodsList.size(); i++) {
            listSet.add(goodsList.get(i));
        }
        shop.showGoods();
    }
}
