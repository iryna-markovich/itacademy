package by.itacademy.studentList;

import java.util.Date;

public class Teacher extends Person {
    private String type;
    private int grade;

    public Teacher(String name, String surname, Date birthday, int grade) {
        super(name, surname, birthday);
        this.type = "Teacher";
        this.grade = grade;
    }

    @Override
    public String toString(){
        return type + ": \t" + " Name -- " + getName() + "\t Surname -- " + getSurname() + "\t Birthday -- " + getDate() + "\t Grade -- " + grade;
    }
}
