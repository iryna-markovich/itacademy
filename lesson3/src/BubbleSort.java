package lesson3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {58, 12, 4, 7, 12, 67, 3, 12, 56, 44};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
