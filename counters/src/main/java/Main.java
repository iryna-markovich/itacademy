import domain.BlockingBuyerQueue;
import domain.BuyerGenerator;
import domain.BuyerQueue;
import domain.MultiThreadCounter;

public class Main {
    public static void main(String[] args) {
        BuyerQueue queue = new BlockingBuyerQueue();
        new MultiThreadCounter(queue).service();
        new MultiThreadCounter(queue).service();
        new BuyerGenerator(queue).execute();

    }
}
