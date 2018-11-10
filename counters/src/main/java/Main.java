import domain.BuyerGenerator;
import domain.Counter;
import domain.MultiThreadCounter;
import goods.Milk;
import goods.Bread;
import goods.Butter;
import domain.Buyer;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Buyer> buyers = new LinkedList<>();

        new MultiThreadCounter(buyers).service();
        new MultiThreadCounter(buyers).service();
        new BuyerGenerator(buyers).execute();

    }
}
