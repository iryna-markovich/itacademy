package lesson4.by.itacademy.array;

public class SortedArray {
    private ReadableArray in;

    public SortedArray(ReadableArray array) {
        this.in = array;
    }

    public void sort() {
        for (int i = 0; i < in.array().length; i++) {
            int minimum = in.array()[i];
            int index = i;
            for (int j = i + 1; j < in.array().length; j++) {
                if (minimum >= in.array()[j]) {
                    minimum = in.array()[j];
                    index = j;
                }
            }
            in.array()[index] = in.array()[i];
            in.array()[i] = minimum;
        }
    }
}
