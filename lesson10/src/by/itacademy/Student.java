package by.itacademy;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private boolean isDismissed;
    @Generate
    private Date dateBirthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsDismissed(boolean dismissed) {
        this.isDismissed = dismissed;
    }

    /*
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDismissed=" + isDismissed +
                ", dateBirthday=" + dateBirthday +
                '}';
    }*/
}