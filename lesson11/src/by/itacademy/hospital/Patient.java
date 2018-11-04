package by.itacademy.hospital;

import java.util.Scanner;

public class Patient {
    public static final Scanner SCANNER = new Scanner(System.in);
    String name;
    String surname;
    String dateOfBirth;
    boolean isSick;

     {
        System.out.println("Name:");
        this.name = SCANNER.next();
        System.out.println("Surname:");
        this.surname = SCANNER.next();
        System.out.println("dateOfBirth ( dd-mm-yyyy ):");
        this.dateOfBirth = SCANNER.next();
        System.out.println("Do have sickness?:");
        this.isSick = SCANNER.nextBoolean();
    }

    @Override
    public String toString() {
         StringBuilder info = new StringBuilder();
        info.append(name).append(";").append(surname).append(";").append(dateOfBirth).append(";").append(isSick);
        return info.toString();
    }
}
