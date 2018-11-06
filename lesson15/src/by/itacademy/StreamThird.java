package by.itacademy;

public class StreamThird extends Thread {
    SynchronizedObject SO;

    StreamThird(SynchronizedObject SO) {
        this.SO = SO;
    }

    @Override
    public void run() {
        SO.start();
    }
}
