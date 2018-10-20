package operations.sort;

import operations.GoodsPriceComparator;
import operations.Operation;
import shopStructure.Goods;
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
        Set<Goods> goodsListSortByPrice = new TreeSet<>(goodsPriceComparator);
        for (Goods item : shop.getGoodsList()) {
            goodsListSortByPrice.add(item);
        }
        shop.showTableHead();
        for (Goods item : goodsListSortByPrice) {
            item.getString();
        }
    }
}
