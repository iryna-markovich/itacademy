package domain;

import goods.Bread;
import goods.Butter;
import goods.Milk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BuyerGenerator {
    private final Queue<Buyer> buyers;
    private List<Buyer> regularBuyers = Arrays.asList(
            new Buyer("Name_1", 100).add(new Milk()).add(new Bread()).add(new Butter()),
            new Buyer("Name_2", 2).add(new Milk()).add(new Milk()).add(new Butter()),
            new Buyer("Name_3", 3500).add(new Butter()).add(new Butter()).add(new Butter()),
            new Buyer("Name_4", 100).add(new Milk()).add(new Bread()).add(new Butter()),
            new Buyer("Name_5", 2).add(new Milk()).add(new Milk()).add(new Butter()),
            new Buyer("Name_6", 3500).add(new Butter()).add(new Butter()).add(new Butter())
    );
    private final Random random = new Random();

    public BuyerGenerator(Queue<Buyer> buyers) {
        this.buyers = buyers;
    }

    public void execute() {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Buyer buyer = regularBuyers.get(random.nextInt(7));
                    synchronized (buyers) {
                        buyers.add(buyer);
                        buyers.notify();
                    }
                }
            }
        });
        thread.start();
    }
}
