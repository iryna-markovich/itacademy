package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private String nameOfShop = "Super shop";
    private String location = "Minsk";
    private String[] emails = {"sgasdg@gmail.com", "aaaaasfs@gmail.com", "bbbesfwef@gmail.com"};
    private List<Goods> goods = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String description;
    private String year;
    private int price;
    private boolean visible;

//    {
//        goods.add(new Goods(id, name, description, year, price, visible));
//        goods.add(new Goods(id, name, description, year, price, visible));
//        goods.add(new Goods(id, name, description, year, price, visible));
//    }

    public Shop() {
        this.name = name;
        this.location = location;
        this.emails = emails;
        this.goods = goods;
    }

    public List<Goods> get() {
        return goods;
    }
}
