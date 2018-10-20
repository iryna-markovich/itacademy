package operations.other;

import operations.Operation;
import shopStructure.Goods;
import shopStructure.Shop;

import java.util.Map;
import java.util.Set;

public class AddGoods implements Operation {
    private Shop shop;

    private int counter = 1;

    @Override
    public void call() {
        Set<Goods> goodsList = shop.getGoodsList();
        System.out.println("Товар добавлен:");
        goodsList.add(new Goods((long) (goodsList.size() + counter),"name" + counter, "description","year", 1 + counter, true));
        shop.showGoods();
        counter++;
    }
}
