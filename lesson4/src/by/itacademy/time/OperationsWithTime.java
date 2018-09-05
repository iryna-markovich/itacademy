package lesson4.by.itacademy.time;


class OperationsWithTime {
    public static void main(String args[]) {
        Time time1 = new Time(5, 45, 44);
        Time time2 = new Time(54);
        if (time1.compareTo(time2) > 0) {
            System.out.println(time1.getSeconds() + " is bigger then " + time2.getSeconds());
        } else if (time1.compareTo(time2) < 0) {
            System.out.println(time1.getSeconds() + " is bigger then " + time2.getSeconds());
        } else {
            System.out.println("The time parties are equals");
        }
    }
}












