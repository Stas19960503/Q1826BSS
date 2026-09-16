package lesson3;

public class FibonacciArray {
    public int[] fibArray(int length) {

        int[] arr = new int[length];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }
}
