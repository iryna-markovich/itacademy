package lesson3;

import java.util.Arrays;

public class CheckTheAscendingSequence {
    public static void main(String[] args) {
        int number = 1234566;
        int length = String.valueOf(number).length();
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        System.out.println(Arrays.toString(array));
        boolean ascending = true;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                ascending = false;
                break;
            }
        }
        System.out.println(ascending ? "Возсрастает" : "Не возрастает");
    }
}
