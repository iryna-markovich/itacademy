package operations;

import shopStructure.Good;

import java.util.Comparator;

public class GoodsPriceComparator implements Comparator<Good> {

    @Override
    public int compare(Good good1, Good good2) {
        return good2.getPrice() - good1.getPrice();
    }

}
