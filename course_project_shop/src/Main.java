import menu.Menu;
import shopStructure.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.run();
        Menu menu = new Menu();
        menu.run();
    }
}
