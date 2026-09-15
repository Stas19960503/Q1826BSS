package lesson2;

import java.util.Scanner;

public class SumDivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int min, max;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num1;
            max = num2;
        }

        int sum = 0;
        System.out.println("Числа между " + min + " и " + max + ", которые делятся на 3:");

        for (int i = min + 1; i < max; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println();
        System.out.println("Сумма всех таких чисел: " + sum);

        scanner.close();
    }
}
