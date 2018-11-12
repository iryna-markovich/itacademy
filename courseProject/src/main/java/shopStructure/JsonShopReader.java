package shopStructure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static menu.Menu.setShop;

public class JsonShopReader {
    public void call() {
        String path = "D:\\Learning\\JAVA\\itacademy\\courseProject\\src\\main\\resources\\shop.json";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new GsonBuilder().registerTypeAdapter(Shop.class, new ShopDeserializer())
                .registerTypeAdapter(Good.class, new GoodDeserializer())
                .create();
        setShop(gson.fromJson(bufferedReader, Shop.class));
    }
}
