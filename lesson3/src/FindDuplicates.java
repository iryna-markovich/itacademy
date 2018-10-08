package lesson3;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {58, 12, 4, 7, 12, 67, 3, 3, 3, 12, 12, 12, 56, 44, 4, 4, 4, 4, 4};
        boolean[] checked = new boolean[arr.length];
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j] && !checked[j]) {
                    counter++;
                    checked[j] = true;
                }
            }
            if (counter > 1) {
                System.out.println("[" + arr[i] + "] - повторений " + counter);
                counter = 1;
            }
        }
    }
}
