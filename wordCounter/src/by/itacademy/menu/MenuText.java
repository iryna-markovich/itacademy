package by.itacademy.menu;

import by.itacademy.operation.Text;

import java.util.Scanner;

public class MenuText implements RootMenuItem {
    public void execute() {
        new Text().execute();
    }
}
