package by.itacademy.hospital;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Hospital hospital = new Hospital();
        //hospital.addPatient(new Patient());
        System.out.println(hospital);

        File file = new File("hospitalList.txt");
        InputStream readFile = new FileInputStream(file);
        int size = readFile.available();
//        for (int i = 0; i < size; i++) {
//            System.out.print((char) readFile.read());
//        }
//        readFile.close();

        int arrSize = 2;
        for (int j = 0; j <= (file.length() / arrSize); j++) {
            byte[] bs = new byte[arrSize];
            readFile.read(bs);
            System.out.print(new String(bs));
        }
    }
}
