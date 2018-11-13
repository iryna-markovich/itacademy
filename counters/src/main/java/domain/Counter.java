package domain;

import domain.goods.Good;

import java.awt.*;
import java.util.List;
import java.util.Queue;

import static java.lang.Thread.currentThread;

public class Counter {
    final private BuyerQueue queue;

    public Counter(BuyerQueue queue) {
        this.queue = queue;
    }

    public void service() {
        Buyer buyer = queue.select();

//        synchronized (buyers) {
//            while (buyers.isEmpty()) {
//                try {
//                    buyers.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            buyer = buyers.poll();
//        }

        StringBuilder s = new StringBuilder();
        if (buyer.buy(costOf(buyer.getGoods()))) {
            s.append(buyer.getGoods());
        } else {
            s.append("Недостаточно средств!");
        }
        s.append(" ").append(buyer.getName())
                .append(" ").append(buyer.getSumOfMoney())
                .append(" ").append(currentThread().getName());
        System.out.println(s);

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
