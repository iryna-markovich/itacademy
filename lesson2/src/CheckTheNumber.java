package lesson2;

public class CheckTheNumber {
    public static void main(String[] args) {
        int number = 79;
        String strNumber = Integer.toString(number);
        int lastNumber = strNumber.length() - 1;
        char lastChar = strNumber.charAt(lastNumber);
        String strLastNumber = Character.toString(lastChar);
        if (strLastNumber.equals("7")) {
            System.out.println("The last number is 7");
        } else {
            System.out.println("7 is not the last");
        }
    }
}
