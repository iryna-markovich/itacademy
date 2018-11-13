package domain;

import java.util.LinkedList;
import java.util.Queue;

public class SynchronizedBuyerQueue implements BuyerQueue {
    final private Queue<Buyer> buyers = new LinkedList<>();

    @Override
    public synchronized void insert(Buyer buyer) {
        buyers.add(buyer);
        notify();
    }

    @Override
    public synchronized Buyer select() {
        while (buyers.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return buyers.poll();
    }
}
