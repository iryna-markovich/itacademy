import com.google.gson.Gson;
import menu.Menu;
import shopStructure.Shop;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
        Gson gson = new Gson();
    }
}

