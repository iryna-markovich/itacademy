package shopStructure;

import operations.GoodsNameComparator;

import java.util.*;

public class Shop extends GoodsNameComparator {
    private String name = "Super shop";
    private String location = "Minsk";
    private List<String> emails = Arrays.asList("sgasdg@gmail.com", "aaaaasfs@gmail.com", "bbbesfwef@gmail.com");
    private GoodsNameComparator goodsNameComparator = new GoodsNameComparator();
    private Set<Goods> goodsList = new TreeSet<>(goodsNameComparator);

    {
        goodsList.add(new Goods(0L, "CD player", "Super CD player SONY", "2004-10-25", 45, true));
        goodsList.add(new Goods(1L, "Car BMW", "Silver car", "2010-10-25", 534, true));
        goodsList.add(new Goods(2L, "Milk", "Milk 3.5%", "2012-10-25", 12, true));
        goodsList.add(new Goods(3L, "Bag", "Super bag for notebook", "2015-10-25", 34, true));
        goodsList.add(new Goods(4L, "Bus", "Big bus", "2007-10-25", 54, true));
    }

    public Set<Goods> getGoodsList() {
        return goodsList;
    }

    public int size() {
        return goodsList.size();
    }

    public void showTableHead() {
        System.out.printf("%-10s%-15s%-30s%-15s%-10s%-10s%n", "ID", "Name", "Description", "Year", "Price", "On stock");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public void showGoods() {
        showTableHead();
        for (Goods item : goodsList) {
            item.getString();
        }
    }

    {
        StringBuilder info = new StringBuilder("МАГАЗИН\n");
        info.append(name).append("\t").append(location).append("\t").append(emails).append("\n");
        System.out.println(info);
        showGoods();
    }
}





