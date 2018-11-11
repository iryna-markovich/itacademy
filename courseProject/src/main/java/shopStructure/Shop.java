package shopStructure;

import com.google.gson.Gson;
import operations.GoodsNameComparator;

import java.util.*;

public class Shop extends GoodsNameComparator {
    private String name = "Super shop";
    private String location = "Minsk";
    private List<String> emails = Arrays.asList("sgasdg@gmail.com", "aaaaasfs@gmail.com", "bbbesfwef@gmail.com");
    private GoodsNameComparator goodsNameComparator = new GoodsNameComparator();

    private Set<Good> goodList = new TreeSet<>(goodsNameComparator);

    public Shop(Set<Good> good) {
        this.goodList = goodList;
    }

    public Shop() {

    }

    public void add(Good good) {
        goodList.add(good);
    }

    public Set<Good> getGoodList() {
        return goodList;
    }

    public int size() {
        return goodList.size();
    }

    public void showTableHead() {
        System.out.printf("%-10s%-15s%-30s%-15s%-10s%-10s%n", "ID", "Name", "Description", "Year", "Price", "On stock");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public void showGoods() {
        showTableHead();
        for (Good item : goodList) {
            item.toString();
        }
    }

    {
        StringBuilder info = new StringBuilder(name);
        info.append("\t").append(location).append("\t").append(emails).append("\n");
        System.out.println(info);
        showGoods();
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}



