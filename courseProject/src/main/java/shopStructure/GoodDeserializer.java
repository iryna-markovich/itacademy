package shopStructure;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class GoodDeserializer implements JsonDeserializer<Good> {
    @Override
    public Good deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = element.getAsJsonObject();
        Good good = new Good();
        good.setId(jsonObject.get("id").getAsInt());
        good.setName(jsonObject.get("name").getAsString());
        good.setDescription(jsonObject.get("description").getAsString());
        //good.setYear((Date) context.deserialize(jsonObject.get("year"), Date.class));
        good.setPrice(jsonObject.get("price").getAsInt());
        good.setIsVisible(jsonObject.get("visible").getAsBoolean());
        return good;
    }
}