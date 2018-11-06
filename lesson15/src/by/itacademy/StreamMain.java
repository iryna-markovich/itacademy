package by.itacademy;

public class StreamMain {
    static StreamFirst streamFirst;
    static StreamSecond streamSecond;
    static StreamThird streamThird;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedObject SO = new SynchronizedObject();

        streamFirst = new StreamFirst(SO);
        streamSecond = new StreamSecond(SO);
        streamThird = new StreamThird(SO);
        streamFirst.start();
        streamSecond.start();
        streamThird.start();


    }
}

