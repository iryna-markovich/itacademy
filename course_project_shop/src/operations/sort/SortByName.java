package operations.sort;

import operations.Operation;
import shopStructure.Shop;

public class SortByName implements Operation {
    Shop shop;

    public SortByName(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        shop.showGoods();
    }
}
