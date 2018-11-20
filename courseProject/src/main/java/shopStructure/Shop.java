package shopStructure;

import com.google.gson.Gson;
import operations.GoodsNameComparator;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Shop extends GoodsNameComparator {
    private String name;
    private String location;
    private Set<String> emails;
    private Set<Good> goods = new TreeSet<>(new GoodsNameComparator());

    //public Shop(Set<Good> goods) {
    // this.goods = goods;
    //}
    public Shop() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addGood(Good good) {
        goods.add(good);
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public int size() {
        return goods.size();
    }


    public void showTableHead() {
        System.out.printf("%-10s%-15s%-30s%-15s%-10s%-10s%n", "ID", "Name", "Description", "Year", "Price", "On stock");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public void showGoods() {
        for (Good item : goods) {
            item.toString();
        }
    }

    public Set<Good> getGoods() {
        return goods;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(name);
        info.append("\n").append(location).append(" | ").append(emails);
        return info.toString();
    }

}

