package domain;

import java.util.Queue;

public class MultiThreadCounter {
    private Counter counter;

    public MultiThreadCounter(Queue<Buyer> buyers) {
        this.counter = new Counter(buyers);
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
