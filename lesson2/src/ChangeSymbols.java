package lesson2;

public class ChangeSymbols {
    public static void main(String[] args) {
        String str = "Имеется строка, которая содержит символы ? и символы #. Замените все символы ? на HELLO, а # - удалите.";
        String newStr = str.replace("?", "HELLO").replace("#", "");
        System.out.println(newStr);
    }
}
