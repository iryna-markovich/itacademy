package by.itacademy;

import java.util.Date;

public class Student {
    @Generate
    private String name;
    @Generate
    private int age;
    @Generate
    private boolean isDismissed;
    @Generate
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.birthday = dateBirthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsDismissed(boolean dismissed) {
        this.isDismissed = dismissed;
    }


    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Student\n");
        info.append(name).append("\t").append(age).append("\ndismissed: ").append(isDismissed).append("\nbirthday: ").append(birthday);
        return info.toString();
    }
}