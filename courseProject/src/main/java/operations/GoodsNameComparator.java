package operations;

import shopStructure.Good;

import java.util.Comparator;

public class GoodsNameComparator implements Comparator<Good> {
    @Override
    public int compare(Good good1, Good good2) {
        return good1.getName().compareTo(good2.getName());
    }
}