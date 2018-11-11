package domain;

import goods.Good;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private List<Good> goods = new ArrayList<>();
    private double sumOfMoney;
    private String name;

    public Buyer(String name, double sumOfMoney) {
        this.name = name;
        this.sumOfMoney = sumOfMoney;
    }

    public Buyer add(Good good) {
        goods.add(good);
        return this;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public double getSumOfMoney() {
        return sumOfMoney;
    }

    public String getName() {
        return name;
    }

    public boolean buy(double cost) {
        double sumOfMoney = this.sumOfMoney - cost;
        if (sumOfMoney > 0) this.sumOfMoney = sumOfMoney;
        return sumOfMoney > 0;
    }
}
