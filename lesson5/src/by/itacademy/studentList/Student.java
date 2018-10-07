package by.itacademy.studentList;

import java.util.Date;

public class Student extends Person {
    private String type;

    public Student(String name, String surname, Date birthday) {
        super(name, surname, birthday);
        this.type = "Student";
    }

    @Override
    public String toString() {
        return type + ": \t" + " Name -- " + getName() + "\t Surname -- " + getSurname() + "\t Birthday -- " + getDate();
    }
}
