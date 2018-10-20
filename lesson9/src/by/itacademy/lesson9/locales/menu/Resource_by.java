package by.itacademy.lesson9.locales.menu;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;

public class Resource_by extends ResourceBundle {
    private Hashtable resources = new Hashtable();

    public Resource_by() {
        resources.put("exit", "Sortie");
        resources.put("cancel", "Quitter");

    }

    protected Object handleGetObject(String key) {
        return resources.get(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }
}