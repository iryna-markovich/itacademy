package lesson2;

public class CashRub {
    public static void main(String[] args) {
        int cashRUB = 4001;
        String strCash = Integer.toString(cashRUB);
        char lastNum = strCash.charAt(strCash.length() - 1);
        String strLastNum = Character.toString(lastNum);
        String strCore = "рубл";
        String strEnd1 = "ь";
        String strEnd2 = "я";
        String strEnd3 = "ей";
        if (cashRUB >= 0) {
            if (strLastNum.equals("1")) {
                System.out.println(cashRUB + " " + strCore + strEnd1);
            } else if (strLastNum.equals("2") || strLastNum.equals("3") || strLastNum.equals("4")) {
                System.out.println(cashRUB + " " + strCore + strEnd2);
            } else {
                System.out.println(cashRUB + " " + strCore + strEnd3);
            }
        } else {
            System.out.println("bad value");
        }
    }
}
