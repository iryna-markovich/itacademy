package operations.other;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import menu.Menu;
import operations.Operation;
import shopStructure.Good;
import shopStructure.GoodDeserializer;
import shopStructure.Shop;
import shopStructure.ShopDeserializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.registry.Registry;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddGoods implements Operation {
    private final Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @Override
    public void call() {
        try (FileInputStream fis = new FileInputStream(
                Objects.requireNonNull(this.getClass().getClassLoader().getResource("\\resources\\shop.json")).getFile());
             InputStreamReader isr = new InputStreamReader(fis)) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Shop.class, new ShopDeserializer())
                    .registerTypeAdapter(Good.class, new GoodDeserializer())
                    .create();
            Menu.shop = gson.fromJson(isr, Shop.class);
        } catch (JsonParseException | IOException e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }
    /*
    private Shop shop;

    private int counter = 1;

    @Override
    public void call() {
        Set<Good> goodList = shop.getGoodList();
        System.out.println("Товар добавлен:");
        goodList.add(new Good((goodList.size() + counter),"name" + counter, "description",, 1 + counter, true));
        shop.showGoods();
        counter++;
    }
    */
}
