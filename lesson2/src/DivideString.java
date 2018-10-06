package lesson2;

public class DivideString {
    public static void main(String[] args) {
        String str = "Создайте переменную типа String c любым текстом (не сильно короткое)";
        int countSymbols = str.length();
        String startStr = str.substring(0, countSymbols / 2);
        String endStr = str.substring(countSymbols / 2);
        System.out.println(countSymbols);
        System.out.println(startStr);
        System.out.println(endStr);
    }
}
