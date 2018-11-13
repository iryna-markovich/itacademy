package domain;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingBuyerQueue implements BuyerQueue {
    private final BlockingQueue<Buyer> buyers = new LinkedBlockingQueue<>();

    @Override
    public void insert(Buyer buyer) {
        try {
            buyers.put(buyer);
        } catch (InterruptedException e) {
            throw new IllegalThreadStateException(e.getMessage());
        }
    }

    @Override
    public Buyer select() {
        try {
           return buyers.take();
        } catch (InterruptedException e) {
            throw new IllegalThreadStateException(e.getMessage());
        }
    }

}
