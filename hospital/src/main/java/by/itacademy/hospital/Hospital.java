import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Patient> patients;

    public Hospital() {
        patients = new ArrayList<>();
    }

    public Hospital(List<Patient> patients) {
        this.patients = patients;
    }

    public void add(Patient patient){
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String toJson(){

        return new Gson().toJson(this);
    }
}
