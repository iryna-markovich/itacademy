package lesson2;

public class GetFormatedTime {
    public static void main(String[] args) {
        long sec = 3600L;
        final int SEC_IN_MINUTE = 60;
        final int SEC_IN_HOUR = SEC_IN_MINUTE * 60;
        System.out.println(sec / SEC_IN_HOUR + " hours " + (sec % SEC_IN_HOUR) / SEC_IN_MINUTE + " minutes " + ((sec % SEC_IN_HOUR) % SEC_IN_MINUTE) + " sec ");
    }
}
