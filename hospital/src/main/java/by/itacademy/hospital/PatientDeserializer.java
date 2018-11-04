package by.itacademy.hospital;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PatientDeserializer implements JsonDeserializer<Patient> {
    @Override
    public Patient deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Patient patient = new Patient();
        patient.setName(jsonObject.get("name").getAsString());
        patient.setSurname(jsonObject.get("surname").getAsString());
        patient.setDateOfBirth((DateOfBirth) context.deserialize(jsonObject.get("dateOfBirth"), DateOfBirth.class));
        patient.setIsSick(jsonObject.get("isSick").getAsBoolean());

        //patient.setSurname((FacialHair) context.deserialize(jsonObject.get("facialHair"), FacialHair.class));

        JsonArray weapons = jsonObject.getAsJsonArray("weapons");

        return patient;
    }
}