package by.itacademy.studentList;

//Создайте класс Студент с полями имя, фамилия, дата рождения. Поле даты рождения должно быть типа Date. Создайте дополнительный класс.
// У этого класса есть поле, в котором содержится список Студентов. Но тип этого массива должен быть такой, чтобы получать доступ информацию о
// дате рождения Студента полиморфно. Это необходимо для того, чтобы у нас была возможность получать информацию о дате рождения с помощью этого
// класса не только для Студентов. Создайте соответствующий интерфейс. Также этот класс должен реализовывать 2 интерфейса. Один позволяет заполнять
// данные студентов из консоли. День рождения должен вводиться в виде строки, затем конвертироваться в Date и записываться в объект Студент (SimpleDateFormat).
// Другой интерфейс рассчитывает средний возраст всех студентов. И выводит результат в следующем виде: 50 лет 3 месяца 5 дней 10 часов и 5 минут.

import java.util.Date;

public abstract class StudentList extends List {

    public StudentList(int size) {
        super(size);
    }
/*
    @Override
    public void read() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter student name");
            String name = SC.next();
            System.out.println("Enter student surname");
            String surname = SC.next();
            System.out.println("Enter student birthday");
            Date birthday = parse(SC.next());
            list[i] = new Student(name, surname, birthday);
        }
    }*/
}
