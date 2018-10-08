package lesson2;

public class CheckTheSq {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int r = 5;
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double compareDiagonal = hypotenuse - r * 2;
        if (compareDiagonal <= 0) System.out.println("It is possible to cover the sq");
        else System.out.println("It is impossible");
    }
}
