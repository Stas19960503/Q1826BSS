package lesson3;

public class MinMaxSum {
    public static void main(String[] args) {

        int[] numbers = {15, 3, 78, 42, 8, 99, 23, 56, 4, 61};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int sum = min + max;

        System.out.println("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Сумма минимального и максимального: " + sum);
    }
}
