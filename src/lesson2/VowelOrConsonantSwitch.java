package lesson2;


import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите английскую букву: ");

        char letter = scanner.next().toLowerCase().charAt(0);

        if (letter >= 'a' && letter <= 'z') {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Буква '" + letter + "' — гласная.");
            } else {
                System.out.println("Буква '" + letter + "' — согласная.");
            }

        } else {
            System.out.println("Ошибка: Вы ввели не английскую букву.");
        }
        scanner.close();
    }
}
