import exceptions.ArrayIndexOutOfBoundsException;
import menu.Menu;

import java.io.IOException;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            Menu menu = new Menu();
            menu.run();
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));

        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
    }
}

