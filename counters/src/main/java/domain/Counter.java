package domain;

import goods.Good;

import java.util.List;
import java.util.Queue;

import static java.lang.Thread.currentThread;

public class Counter {
    final private Queue<Buyer> buyers;

    public Counter(Queue<Buyer> buyers) {
        this.buyers = buyers;
    }

    public void service() {
        Buyer buyer;
        synchronized (buyers) {
            while (buyers.isEmpty()) {
                try {
                    buyers.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buyer = buyers.poll();

        }
        if (buyer.buy(costOf(buyer.getGoods()))) {
            System.out.println(buyer.getName() + " " + currentThread().getName() + " " + buyer.getGoods());
        } else {
            System.out.println(buyer.getName() + " " + currentThread().getName() + " not enough money");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double costOf(List<Good> goods) {
        double cost = 0;
        for (Good good : goods) {
            cost += good.getPrice();
        }
        return cost;
    }


}
