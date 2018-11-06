package by.itacademy;

public class SynchronizedObject {
    public synchronized void execute() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public synchronized void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("dgfg");
        }
    }
}
