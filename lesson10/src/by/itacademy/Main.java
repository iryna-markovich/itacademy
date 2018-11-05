package by.itacademy;

import java.lang.reflect.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Map<Class<?>, RandomGenerator<?>> generators = new HashMap<>();

        generators.put(int.class, new AgeGenerator());
        generators.put(String.class, new NameGenerator());
        generators.put(Date.class, new BirthdayGenerator());
        generators.put(boolean.class, new IsDismissedGenerator());

        Class<Student> reflectedClass = Student.class;
        Constructor<Student> defaultConstructor = reflectedClass.getConstructor();
        Student student = defaultConstructor.newInstance();

        for (Field f : reflectedClass.getDeclaredFields()) {
            if (f.isAnnotationPresent(Generate.class)) {
                for (Method m : reflectedClass.getMethods()) {
                    Class<?> typeField = f.getType();
                    String nameField = f.getName();
                    String nameMethod = m.getName();
                    if (nameMethod.startsWith("set") && nameMethod.toLowerCase().endsWith(nameField)) {
                        m.invoke(student, generators.get(typeField).execute());
                    }
                }
            }
        }

        System.out.println(student);
    }
}