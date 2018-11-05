package by.itacademy.hospital;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AddPatient implements Items {
    static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void run(Hospital hospital) throws IOException {
        System.out.println("Name:");
        String name = SCANNER.next();
        System.out.println("Surname:");
        String surname = SCANNER.next();
        System.out.println("dateOfBirth ( dd-mm-yyyy ):");
        String dateOfBirth = SCANNER.next();
        System.out.println("Do have sickness?:");
        boolean isSick = SCANNER.nextBoolean();
        Patient patient = new Patient(name, surname, dateOfBirth, isSick);
        hospital.addPatient(new Patient(name, surname, dateOfBirth, isSick));

        String text = patient.toString(); // строка для записи

        FileOutputStream fos = new FileOutputStream("hospitalList.txt", true);
        byte[] buffer = text.getBytes();
        fos.write(buffer, 0, buffer.length);
        System.out.println("The file has been written");

        SaveToLocaleFile stlf = new SaveToLocaleFile();
        stlf.run(hospital);
    }

    @Override
    public String getName() {
        return "Add new patient";
    }

}
