package by.itacademy.newCalculator.menu;

import by.itacademy.exceptions.OperandsBoundsException;

import java.util.Scanner;


public class MenuDisplay implements RootMenuItem {
    private static final Scanner SCANNER = new Scanner(System.in);

    private MenuItem[] subMenus = {
            new MenuAddition(this),
            new MenuDivision(this),
            new MenuExponent(this),
            new MenuMultiplication(this),
            new MenuRoot(this),
            new MenuSubtraction(this)
    };

    @Override
    public void execute() {
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println(i + " " + subMenus[i].name());
        }
        subMenus[SCANNER.nextInt()].execute();
    }
}
