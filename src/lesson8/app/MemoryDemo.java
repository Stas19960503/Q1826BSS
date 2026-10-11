package lesson8.app;

import lesson8.exception.EmptyMemoryException;
import lesson8.exception.MemoryOverflowException;

import java.util.Scanner;

public class MemoryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemoryService service = new MemoryService();

        System.out.println("=== Память приложения ===");
        System.out.println("Введите слово — оно сохранится в память.");
        System.out.println("Введите 'get' — вернётся самый старый элемент.");
        System.out.println("Введите 'exit' — выход из программы.");
        System.out.println("Максимум " + Memory.MAX_SIZE + " элементов.\n");

        while (true) {
            System.out.print("Ввод: ");
            String input = scanner.nextLine().trim();

            // Выход
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            // Пустой ввод
            if (input.isEmpty()) {
                System.out.println("Пустая строка — попробуйте снова.");
                continue;
            }

            // Обработка 'get'
            if (input.equalsIgnoreCase("get")) {
                try {
                    String value = service.get();
                    System.out.println("Получен элемент: \"" + value + "\"");
                } catch (EmptyMemoryException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                continue;
            }

            // Добавление
            try {
                service.add(input);
                System.out.println("Сохранено: \"" + input + "\" | В памяти: "
                        + service.size() + "/" + Memory.MAX_SIZE);
            } catch (MemoryOverflowException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
