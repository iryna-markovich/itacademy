package by.itacademy.atm;

import java.util.Scanner;

public abstract class ATM implements CashIn, CashOut, BankOwnerOfATM, ManufactureOfATM, FullSumCash, QuantityOfBanknotes {
    public static final Scanner SC = new Scanner(System.in);
    private String manufactureName = "ATMPRO";
    private Currency defaultSumOfCash = new Currency(2, 3, 5, 0);
    int cash;

    @Override
    public String getManufactureName() {
        return this.manufactureName;
    }

    @Override
    public void credit() {
        System.out.println("Credit cash: ");
        cash = -SC.nextInt();
        if (getCurrentCash() < -cash) {
            System.out.println("NOT ENOUGH CASH in ATM, SORRY");
            cash = 0;
        }
    }

    @Override
    public void deposit() {
        System.out.println("Deposit cash: ");
        cash = SC.nextInt();
        if (cash < 1) {
            System.out.println("NO COINS, BANKNOTES are ONLY ALLOWED");
            cash = 0;
        }
    }

    private int countHundredBanknotes() {
        int cashHundred = cash / 100;
        return cashHundred;
    }

    private int countFiftyBanknotes() {
        int cashFifty = (cash % 100) / 50;
        return cashFifty;
    }

    private int countTwentyBanknotes() {
        int cashTwenty = ((cash % 100) % 50) / 20;
        return cashTwenty;
    }

    private int countRest() {
        int cashRest = ((cash % 100) % 50) % 20;
        return cashRest;
    }

    public int getCurrentCash() {
        return defaultSumOfCash.cashHundred * 100
                + defaultSumOfCash.cashFifty * 50
                + defaultSumOfCash.cashTwenty * 20
                + defaultSumOfCash.cashRest + cash;
    }

    public String getCash() {
        return "Cash TOTAL: ..................... \t" + getTotalCash() + "$";
    }

    @Override
    public String calcQuantity() {
        defaultSumOfCash = new Currency(defaultSumOfCash.cashHundred + countHundredBanknotes(), defaultSumOfCash.cashFifty + countFiftyBanknotes(), defaultSumOfCash.cashTwenty + countTwentyBanknotes(), defaultSumOfCash.cashRest + countRest());
        cash = 0;
        return "Cash TOTAL QUANTITY of banknotes: " + defaultSumOfCash.toString();
    }


}
