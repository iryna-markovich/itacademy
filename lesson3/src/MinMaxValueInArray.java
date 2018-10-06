package lesson3;

import java.util.Arrays;

public class MinMaxValueInArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, -7, 5, 1, 44};
        int min = array[0];
        int max = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = 0;
            }
            if (array[i] == max) {
                array[i] = 99;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

