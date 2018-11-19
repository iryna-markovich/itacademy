package shopStructure;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/*
public class EmailDeserializer implements JsonDeserializer<String> {
    @Override
    public String deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = element.getAsJsonObject();
        List<String> email = new ArrayList<>();
        email.add(jsonObject.get("emails").getAsString());
        return email.toString();
    }
}*/