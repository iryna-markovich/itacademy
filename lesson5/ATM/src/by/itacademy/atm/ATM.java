package by.itacademy.atm;

/**
 * Created by user on 9/15/2018.
 */
public abstract class ATM implements Income, Outcame, VendorInfo {
    private int banknoteOfHundred = 0;
    private int banknoteOfFifty = 0;
    private int banknoteOfTwenty = 0;
    private String vendor;

    public ATM(String vendor) {
        this.vendor = vendor;
    }

    public int getTotalCash() {
        return banknoteOfHundred * 100 + banknoteOfFifty * 50 + banknoteOfTwenty * 20;
    }

    @Override
    public void deposit(int cash) {
        int banknoteOfHundred = cash / 100;
        int banknoteOfFifty = (cash - banknoteOfHundred * 100) / 50;
        int banknoteOfTwenty = (cash - banknoteOfHundred * 100 - banknoteOfFifty * 50) / 20;
        int rest = cash - (banknoteOfHundred * 100 + banknoteOfFifty * 50 + banknoteOfTwenty * 20);
        if (rest == 0) {
            this.banknoteOfHundred += banknoteOfHundred;
            this.banknoteOfFifty += banknoteOfFifty;
            this.banknoteOfTwenty += banknoteOfTwenty;
        }

    }

    @Override
    public void credit(int cash) {
        if (cash - (banknoteOfHundred * 100 + banknoteOfFifty * 50 + banknoteOfTwenty * 20) < 0) {
            int banknoteOfHundred = cash / 100;
            int banknoteOfFifty = (cash - banknoteOfHundred * 100) / 50;
            int banknoteOfTwenty = (cash - banknoteOfHundred * 100 - banknoteOfFifty * 50) / 20;
            if (this.banknoteOfHundred >= banknoteOfHundred && this.banknoteOfFifty >= banknoteOfFifty && this.banknoteOfTwenty >= banknoteOfTwenty) {
                this.banknoteOfHundred -= banknoteOfHundred;
                this.banknoteOfFifty -= banknoteOfFifty;
                this.banknoteOfTwenty -= banknoteOfTwenty;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("ATM\t").append(banknoteOfHundred).append(" x 100$ banknotes | ").append(banknoteOfFifty).append(" x 50$ banknotes | ").append(banknoteOfTwenty).append(" x 20$ banknotes");
        return out.toString();
    }

    @Override
    public String display() {
        return this.vendor;
    }

}
