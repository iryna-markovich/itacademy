package domain;

import java.util.Queue;

public class MultiThreadCounter {
    private Counter counter;

    public MultiThreadCounter(BuyerQueue queue) {
        this.counter = new Counter(queue);
    }

    public void service() {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    counter.service();
                }
            }
        });
        thread.start();
    }
}
