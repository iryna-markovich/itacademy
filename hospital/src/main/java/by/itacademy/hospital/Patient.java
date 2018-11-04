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
}


