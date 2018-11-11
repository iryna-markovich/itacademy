package shopStructure;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ShopDeserializer implements JsonDeserializer<Shop> {
    @Override
    public Shop deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Shop shop = new Shop();
        JsonObject jsonObject = element.getAsJsonObject();
        JsonArray goods = jsonObject.getAsJsonArray("goods");
        for (JsonElement good : goods) {
            Good goodNew = context.deserialize(good, Good.class);
            shop.add(goodNew);
        }
        System.out.println(shop);
        return shop;
    }
}