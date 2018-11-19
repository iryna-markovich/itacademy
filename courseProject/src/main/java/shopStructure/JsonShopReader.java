package shopStructure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Date;

public class JsonShopReader {
    public void call() {
        Gson gson;
        String path = "D:\\Learning\\JAVA\\itacademy\\courseProject\\src\\main\\resources\\shop.json";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        gson = new GsonBuilder()
                .registerTypeAdapter(Shop.class, new ShopDeserializer())
                //.registerTypeAdapter(String.class, new EmailDeserializer())
                .registerTypeAdapter(Date.class, new YearDeserializer())
                .registerTypeAdapter(Good.class, new GoodDeserializer())
                .create();
        Shop shop = gson.fromJson(bufferedReader, Shop.class);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        gson.toJson(shop);
    }
}
