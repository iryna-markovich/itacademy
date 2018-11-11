package by.itacademy.hospital;

import com.google.gson.*;

import java.lang.reflect.Type;

public class PatientDeserializer implements JsonDeserializer<Patient> {
    @Override
    public Patient deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = element.getAsJsonObject();
        Patient patient = new Patient();
        patient.setName(jsonObject.get("name").getAsString());
        patient.setSurname(jsonObject.get("surname").getAsString());
        patient.setDateOfBirth((DateOfBirthDeserializer) context.deserialize(jsonObject.get("dateOfBirth"), DateOfBirthDeserializer.class));
        patient.setIsSick(jsonObject.get("isSick").getAsBoolean());

        JsonArray weapons = jsonObject.getAsJsonArray("weapons");

        return patient;
    }
}
