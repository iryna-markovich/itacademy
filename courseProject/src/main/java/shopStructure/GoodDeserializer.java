package shopStructure;

import com.google.gson.*;

import java.lang.reflect.Type;

public class GoodDeserializer implements JsonDeserializer<Good> {
    @Override
    public Good deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = element.getAsJsonObject();
        Good good = new Good();
        good.setId(jsonObject.get("id").getAsInt());
        good.setName(jsonObject.get("name").getAsString());
        good.setDescription(jsonObject.get("description").getAsString());
        good.setYear(context.deserialize(jsonObject.get("year"), YearDeserializer.class));
        good.setPrice(jsonObject.get("price").getAsInt());
        good.setIsVisible(jsonObject.get("visible").getAsBoolean());
        System.out.println("dddddddddddddddddddddddddddddd");
        return good;
    }
}