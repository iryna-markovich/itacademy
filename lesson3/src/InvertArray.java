package lesson3;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int midValue = arr.length / 2;
        for (int i = 0; i < midValue; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
