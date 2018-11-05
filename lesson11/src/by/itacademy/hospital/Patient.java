package by.itacademy.hospital;

public class Patient {
    String name;
    String surname;
    String dateOfBirth;
    boolean isSick;

    public Patient(String name, String surname, String dateOfBirth, boolean isSick) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.isSick = isSick;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(name).append(";").append(surname).append(";").append(dateOfBirth).append(";").append(isSick).append("\n");
        return info.toString();
    }
}