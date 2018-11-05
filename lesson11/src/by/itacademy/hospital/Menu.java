package by.itacademy.hospital;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);
    private Hospital hospital = new Hospital();

    private List<Items> menu = Arrays.asList(
            new AddPatient(),
            new DisplayFromTextFile(),
            new DisplayFromBinaryFile()
    );

    public void run() throws IOException {
        System.out.println("\nHospital menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + " " + menu.get(i).getName());
        }
        menu.get(SCANNER.nextInt() - 1).run(hospital);
        run();
    }
}