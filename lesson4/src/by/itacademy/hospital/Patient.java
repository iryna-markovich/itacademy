package lesson4.by.itacademy.hospital;

public class Patient {
    private String surname;
    private int age;
    private String diagnosis;
    private boolean vaccination;

    public Patient(String surname, int age, String diagnosis, boolean vaccination) {
        this.surname = surname;
        this.age = age;
        this.diagnosis = diagnosis;
        this.vaccination = vaccination;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Surname: ").append(surname).append("; ");
        output.append("Age: ").append(age).append("; ");
        output.append("Diagnosis: ").append(diagnosis).append("; ");
        output.append("Vaccination: ").append(vaccination).append("; ");
        return output.toString();
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
