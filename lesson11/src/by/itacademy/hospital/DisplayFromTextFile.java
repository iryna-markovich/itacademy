package by.itacademy.hospital;

import java.io.FileInputStream;
import java.io.IOException;

public class DisplayFromTextFile implements Items {
    @Override
    public void run(Hospital hospital) throws IOException {
        String separator = System.getProperty("line.separator");
        FileInputStream fin = new FileInputStream("hospitalList.txt");
        int i = -1;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.print(separator);
    }

    @Override
    public String getName() {
        return "Display from text file";
    }
}
