package by.itacademy.lesson9.locales.menu;

public abstract class ResourceBundle {
    public static final ResourceBundle getBundle(String baseName, String locale) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = baseName + "_" + locale;
        Class c = Class.forName(className);
        ResourceBundle bundle = (ResourceBundle) c.newInstance();
        return bundle;
    }

    //Gets an object for the given key from this resource bundle

    protected abstract Object handleGetObject(String key);
}