package operations.other;

import operations.Operation;
import shopStructure.Shop;

public class Count implements Operation {
    Shop shop;

    public Count(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        System.out.println("Всего товаров .......... " + shop.size());
    }
}
