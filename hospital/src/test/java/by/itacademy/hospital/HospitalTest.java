package by.itacademy.hospital;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HospitalTest {
    @Test
    public void ShouldRetunsIsEqual() {
        Hospital hospital = new Hospital();
        hospital.add(new Patient("Paul", "Mccartney", LocalDate.parse("18.06.1942", DateTimeFormatter.ofPattern("dd.MM.yyyy")), true));
        hospital.add(new Patient("Michael", "Jackson", LocalDate.parse("29.08.1958", DateTimeFormatter.ofPattern("dd.MM.yyyy")), false));

        String expected = "{\"patients\":[{\"name\":\"Paul\",\"surname\":\"Mccartney\",\"dateOfBirth\":{\"year\":1942,\"month\":6,\"day\":18},\"isSick\":true},{\"name\":\"Michael\",\"surname\":\"Jackson\",\"dateOfBirth\":{\"year\":1958,\"month\":8,\"day\":29},\"isSick\":false}]}";

        Assert.assertEquals(expected, hospital.toJson());
    }

}
