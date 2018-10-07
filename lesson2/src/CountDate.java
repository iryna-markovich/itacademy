package lesson2;

public class CountDate {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1601;
        int newDay = day + 1;
        String dateOrdinary = newDay + " " + month + " " + year;
        String dateLastDayInTheMonth = 1 + " " + (month + 1) + " " + year;
        String dateLastDayInTheYear = 1 + " " + (month - 11) + " " + (year + 1);
        if (day < 0 || month <= 0 || month > 12 || year < 0) System.out.println("bad value");
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 31) System.out.println("bad value");
                    else if (newDay > 31 && month == 12) {
                        System.out.println(dateLastDayInTheYear);
                    } else if (newDay > 31 && month < 12) {
                        System.out.println(dateLastDayInTheMonth);
                    } else {
                        System.out.println(dateOrdinary);
                    }
                    break;

                case 2:
                    if ((year % 100 == 0 && year % 400 == 0 && month == 2 && day >= 30) || (year % 400 != 0 && month == 2 && day >= 29))
                        System.out.println("bad value");
                    else if (year % 400 != 0 && newDay >= 29) {
                        System.out.println(dateLastDayInTheYear);
                    } else if (year % 100 == 0 && year % 400 == 0 && newDay >= 30) {
                        System.out.println(dateLastDayInTheMonth);
                    } else {
                        System.out.println(dateOrdinary);
                    }
                    break;

                case 4:
                case 6:
                case 9:
                    if (day > 30) System.out.println("bad value");
                    else if (newDay > 30 && month == 12) {
                        System.out.println(dateLastDayInTheYear);
                    } else if (newDay > 30 && month < 12) {
                        System.out.println(dateLastDayInTheMonth);
                    } else {
                        System.out.println(dateOrdinary);
                    }
                    break;
            }
        }
    }
}
