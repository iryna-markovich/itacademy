package menu;

import exceptions.OperandsBoundsException;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Goods implements RootMenuItem {
    private static final Scanner sc = new Scanner(System.in);
    private Map good = new HashMap<>();

    public Goods() {
        this.good = good;
    }

    private int id;
    private String name;
    private String description;
    private String year;
    private String price;
    private String visible;

    @Override
    public void execute() {
        System.out.println("____________________________________________________________\nКарточка товара:\nВведите id:");
        good.put(id, sc.nextInt());
        System.out.println("Введите название товара:");
        good.put(name, sc.nextLine());
        System.out.println("Опишите товар:");
        good.put(description, sc.nextLine());
        System.out.println("Год производства:");
        good.put(year, sc.nextLine());
        System.out.println("Цена товара:");
        good.put(price, sc.nextLine());
        System.out.println("Наличие true/false:");
        good.put(visible, sc.nextLine());
    }
}
