package by.itacademy.atm;

public class Currency {
    int cashHundred;
    int cashFifty;
    int cashTwenty;
    int cashRest;

    public Currency(int cashHundred, int cashFifty, int cashTwenty, int cashRest) {
        this.cashHundred = cashHundred;
        this.cashFifty = cashFifty;
        this.cashTwenty = cashTwenty;
        this.cashRest = cashRest;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("\t").append(cashHundred).append(" x 100$ banknotes\n\t\t\t\t\t\t\t\t\t")
                .append(cashFifty).append(" x 50$ banknotes\n\t\t\t\t\t\t\t\t\t")
                .append(cashTwenty).append(" x 20$ banknotes\n\t\t\t\t\t\t\t\t\t")
                .append(cashRest).append("$ other banknotes");
        return out.toString();
    }
}
