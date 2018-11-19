package operations.sort;

import operations.GoodsPriceComparator;
import operations.Operation;
import shopStructure.Good;
import shopStructure.Shop;

import java.util.Set;
import java.util.TreeSet;

public class SortByPrice extends GoodsPriceComparator implements Operation {
    private Shop shop;
    private GoodsPriceComparator goodsPriceComparator = new GoodsPriceComparator();

    public SortByPrice(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void call() {
        Set<Good> goodListSortByPrice = new TreeSet<>(goodsPriceComparator);
        for (Good item : shop.getGoods()) {
            goodListSortByPrice.add(item);
        }
        shop.showTableHead();
        for (Good item : goodListSortByPrice) {
            item.toString();
        }
    }
}
