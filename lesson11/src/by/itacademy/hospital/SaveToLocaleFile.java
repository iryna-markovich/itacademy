package by.itacademy.hospital;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveToLocaleFile implements Items {
    @Override
    public void run(Hospital hospital) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("hospitalList.bin"));
        for (int i = 0; i < hospital.patients.size(); i++) {
            dos.writeUTF(hospital.patients.get(i).name);
            dos.writeUTF(hospital.patients.get(i).surname);
            dos.writeUTF(hospital.patients.get(i).dateOfBirth);
            dos.writeBoolean(hospital.patients.get(i).isSick);
        }
    }

    @Override
    public String getName() {
        return "Save to the file";
    }
}