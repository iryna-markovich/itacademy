package lesson4.by.itacademy.hospital;

import java.util.Scanner;

public class HospitalList {
    private static final Scanner SC = new Scanner(System.in);
    Patient[] patients;
    int size;

    public HospitalList(int size) {
        patients = new Patient[size];
        this.size = size;
    }

    public void input() {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter surname:");
            String surname = SC.nextLine();
            System.out.println("Enter age:");
            int age = SC.nextInt();
            SC.nextLine();
            System.out.println("Enter diagnosis:");
            String diagnosis = SC.nextLine();
            System.out.println("Enter is there any vaccination? (true/false):");
            boolean vaccination = SC.nextBoolean();
            SC.nextLine();
            patients[i] = new Patient(surname, age, diagnosis, vaccination);
        }
    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++) {
            output.append(patients[i]).append("\n");
        }
        return output.toString();
    }

    public void search(String surname) {
        for (int i = 0; i < size; i++) {
            if ((patients[i].getSurname()).equals(surname)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void search(int age) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getAge() == age) {
                System.out.println(patients[i]);
            }
        }
    }
}
