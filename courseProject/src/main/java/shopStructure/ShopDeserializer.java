package shopStructure;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Set;

public class ShopDeserializer implements JsonDeserializer<Shop> {
    private Set<Good> goodies;

    @Override
    public Shop deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        Shop shop = new Shop();
        JsonObject jsonObject = element.getAsJsonObject();
        shop.setName(jsonObject.get("name").getAsString());
        shop.setLocation(jsonObject.get("location").getAsString());

//        JsonArray emails = jsonObject.getAsJsonArray("emails");
//        for (JsonElement email : emails) {
//            System.out.println(email);
//            String emailNew = context.deserialize(email, String.class);
//            shop.addEmail(emailNew);
//        }

        JsonArray goods = jsonObject.getAsJsonArray("goods");

        for (JsonElement good : goods) {
            Good goodNew = context.deserialize(good, Good.class);
            shop.addGood(goodNew);
        }

        System.out.println(shop);

        StringBuilder info = new StringBuilder("%-10s%-15s%-30s%-15s%-10s%-10s%n \n");
        for (Good good : shop.getGoods()) {
            info.append(good.getId()).append(good.getName()).append(good.getDescription()).append(good.getYear()).append(good.getPrice()).append(good.isVisible()).append("\n");
        }
        System.out.println(info.toString());
        return shop;
    }
}