package operations;

import shopStructure.Goods;

import java.util.Comparator;

public class GoodsNameComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods goods1, Goods goods2) {
        return goods1.getName().compareTo(goods2.getName());
    }
}