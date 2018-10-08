package by.itacademy.studentList;

import java.util.Date;

public abstract class Person implements Dateable {
    private String name;
    private String surname;
    private Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDate() {
        return birthday;
    }

    public abstract String toString();
}
