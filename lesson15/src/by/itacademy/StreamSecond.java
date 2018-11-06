package by.itacademy;

public class StreamSecond extends Thread {
    SynchronizedObject SO;

    StreamSecond(SynchronizedObject SO) {
        this.SO = SO;
    }

    @Override
    public void run() {
        SO.execute();
    }
}