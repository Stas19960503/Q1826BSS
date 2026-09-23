package lesson4;

import java.util.Arrays;

public class ArrayWorker {

    public void sort(int[] array) {
        if (!isValid(array)) {
            System.out.println("Ошибка: массив пуст или равен null.");
            return;
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int findMax(int[] array) {
        if (!isValid(array)) {
            System.out.println("Ошибка: массив пуст или равен null.");
            return Integer.MIN_VALUE;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findIndexByValue(int[] array, int value) {
        if (!isValid(array)) {
            System.out.println("Ошибка: массив пуст или равен null.");
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void printArray(int[] array) {
        if (isValid(array)) {
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("[]");
        }
    }

    private boolean isValid(int[] array) {
        return array != null && array.length > 0;
    }
}
