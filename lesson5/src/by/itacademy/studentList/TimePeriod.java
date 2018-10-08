package by.itacademy.studentList;

public class TimePeriod {
    String years;
    String month;
    String days;
    String hours;
    String minutes;

    public TimePeriod(String years, String month, String days, String hours, String minutes) {
        this.years = years;
        this.month = month;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(years).append("лет ").append(month).append("месяца ").append(days).append("дней ").append(hours).append("часов ").append(minutes).append("минут");
        return out.toString();
    }
}
