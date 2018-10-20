package operations;

import shopStructure.Goods;

import java.util.Comparator;

public class GoodsPriceComparator implements Comparator<Goods> {

    @Override
    public int compare(Goods goods1, Goods goods2) {
        return goods2.getPrice() - goods1.getPrice();
    }

}
