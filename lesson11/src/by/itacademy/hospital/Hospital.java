package by.itacademy.hospital;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Patient> patients = new ArrayList<>();

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        return patients.toString();
    }
}

