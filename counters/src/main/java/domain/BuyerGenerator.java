package domain;

import domain.goods.Bread;
import domain.goods.Butter;
import domain.goods.Milk;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BuyerGenerator {
    private final BuyerQueue queue;
    private List<Buyer> regularBuyers = Arrays.asList(
            new Buyer("Name_1", 100).add(new Milk()).add(new Bread()).add(new Butter()),
            new Buyer("Name_2", 2).add(new Milk()).add(new Milk()).add(new Butter()),
            new Buyer("Name_3", 3500).add(new Butter()).add(new Butter()).add(new Butter()),
            new Buyer("Name_4", 100).add(new Milk()).add(new Bread()).add(new Butter()),
            new Buyer("Name_5", 2).add(new Milk()).add(new Milk()).add(new Butter()),
            new Buyer("Name_6", 3500).add(new Butter()).add(new Butter()).add(new Butter())
    );
    private final Random random = new Random();

    public BuyerGenerator(BuyerQueue queue) {
        this.queue = queue;
    }

    public void execute() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Buyer buyer = regularBuyers.get(random.nextInt(6));
                    queue.insert(buyer);
                }
            }
        });
        thread.start();
    }
}
