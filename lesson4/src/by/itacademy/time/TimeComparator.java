package lesson4.by.itacademy.time;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {
    public int compare(Time a, Time b) {
        if (a.getSeconds() > b.getSeconds()) {
            return 1;
        } else if (a.getSeconds() < b.getSeconds()) {
            return -1;
        } else {
            return 0;
        }
    }

}

