package by.itacademy.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ATM mtbank = new MtbankATM();
        while (true) {
            System.out.println("_______________________________________________________________");
            System.out.println("Press 0 - INFO \n\t  1 - to see TOTAL SUM OF CASH and QUANTITY OF BANKNOTES \n\t  2 - to DEPOSIT cash \n\t  3 - to CREDIT cash \n\t  4 - EXIT");
            System.out.println("_______________________________________________________________");
            int transaction = read.nextInt();
            if(transaction == 0){
                System.out.println("Bank provides ATM: " + mtbank.getBankName());
                System.out.println("Manufacture provides ATM: " + mtbank.getManufactureName());
            }
            if (transaction == 1) {
                System.out.println(mtbank.getCash());
                System.out.println(mtbank.calcQuantity());
            }
            if (transaction == 2) {
                mtbank.deposit();
                System.out.println(mtbank.getCash());
                System.out.println(mtbank.calcQuantity());
            }
            if (transaction == 3) {
                mtbank.credit();
                System.out.println(mtbank.getCash());
                System.out.println(mtbank.calcQuantity());
            }
            if (transaction == 4) {
                break;
            }
        }
    }
}
