package by.itacademy.hospital;

import java.time.LocalDate;

public class Patient {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private boolean isSick;

    public Patient(String name, String surname, LocalDate dateOfBirth, boolean isSick) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.isSick = isSick;
    }

    public Patient() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public void setDateOfBirth(DateOfBirthDeserializer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


