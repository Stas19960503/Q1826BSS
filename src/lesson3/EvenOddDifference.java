package lesson3;

public class EvenOddDifference {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 3, 12, 7, 6, 1};

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (i % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }

        int difference = sumEven - sumOdd;

        System.out.println("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Сумма элементов на четных местах: " + sumEven);
        System.out.println("Сумма элементов на нечетных местах: " + sumOdd);
        System.out.println("Разница (четные - нечетные): " + difference);
    }
}
