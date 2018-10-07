package by.itacademy.atm;

/**
 * Created by user on 9/15/2018.
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new MTBank("MTBank");
        atm.display();
        System.out.println(atm.display());
        atm.deposit(550);
        atm.getTotalCash();
        System.out.println(atm.toString());
        System.out.println(atm.getTotalCash());
        atm.credit(50);
        System.out.println(atm.toString());
        System.out.println(atm.getTotalCash());
    }
}
