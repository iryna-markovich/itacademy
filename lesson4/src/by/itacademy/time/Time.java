package lesson4.by.itacademy.time;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time(int seconds) {
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    public int getSeconds() {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    public int compareTo(Time time) {
        TimeComparator comparator = new TimeComparator();
        return comparator.compare(this, time);
    }

}