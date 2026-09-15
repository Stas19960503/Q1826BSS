package lesson2;

import java.util.Scanner;

public class WordLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа запущена. Введите слово (для выхода напишите 'exit'):");

        while (true) {
            System.out.print("Введите слово: ");

            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Программа завершена. До свидания!");
                break;
            }

            System.out.println("Вы ввели: " + input);
        }
        scanner.close();
    }
}
