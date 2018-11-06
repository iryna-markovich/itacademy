package by.itacademy;

public class StreamFirst extends Thread {
    SynchronizedObject SO;

    StreamFirst(SynchronizedObject SO) {
        this.SO = SO;
    }

    @Override
    public void run() {
        SO.execute();
    }
}

