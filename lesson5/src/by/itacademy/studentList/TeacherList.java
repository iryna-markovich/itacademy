package by.itacademy.studentList;

import java.util.Date;

public abstract class TeacherList extends List {

    public TeacherList(int size) {
        super(size);
    }
/*
    @Override
    public void read() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter teacher name");
            String name = SC.next();
            System.out.println("Enter teacher surname");
            String surname = SC.next();
            System.out.println("Enter teacher birthday");
            Date birthday = parse(SC.next());
            System.out.println("Enter teacher grade");
            int grade = SC.nextInt();
            list[i] = new Teacher(name, surname, birthday, grade);
        }
    }
*/
}
