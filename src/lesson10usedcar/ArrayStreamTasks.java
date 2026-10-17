package lesson10usedcar;

import java.util.Arrays;

public class ArrayStreamTasks {
    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 23, 7, 4, 10, 15, 2, 9};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new RuntimeException("Массив пуст"));
        System.out.println("\n1. Максимальное число: " + max);

        int sumEven = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2. Сумма четных чисел: " + sumEven);

        System.out.println("\n3. Элементы от 5 и выше:");
        Arrays.stream(numbers)
                .filter(n -> n >= 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
