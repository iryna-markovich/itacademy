package by.itacademy.hospital;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisplayFromBinaryFile implements Items {
    @Override
    public void run(Hospital hospital) throws IOException {
        String separator = System.getProperty("line.separator");
        DataInputStream dis = new DataInputStream(new FileInputStream("hospitalList.bin"));
        for (int i = 0; i < hospital.patients.size(); i++) {
            String name = dis.readUTF();
            String surname = dis.readUTF();
            String dateOfBirth = dis.readUTF();
            boolean isSick = dis.readBoolean();
            System.out.printf(name + ";" + surname + ";" + dateOfBirth + ";" + isSick);
            System.out.print(separator);
        }
    }

    @Override
    public String getName() {
        return "Display from binary file";
    }
}


