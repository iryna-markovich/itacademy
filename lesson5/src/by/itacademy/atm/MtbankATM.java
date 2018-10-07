package by.itacademy.atm;

public class MtbankATM extends ATM {
    String bankOwnerName = "MTBank LTD Co.";

    @Override
    public String getBankName() {
        return this.bankOwnerName;
    }

}
