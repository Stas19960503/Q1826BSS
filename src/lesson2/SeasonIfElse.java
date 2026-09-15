package lesson2;


import java.util.Scanner;

public class SeasonIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");

        String month = scanner.nextLine().trim().toLowerCase();

        if (month.equals("декабрь") || month.equals("январь") || month.equals("февраль")) {
            System.out.println("Месяц " + month + " относится к зиме.");
        } else if (month.equals("март") || month.equals("апрель") || month.equals("май")) {
            System.out.println("Месяц " + month + " относится к весне.");
        } else if (month.equals("июнь") || month.equals("июль") || month.equals("август")) {
            System.out.println("Месяц " + month + " относится к лету.");
        } else if (month.equals("сентябрь") || month.equals("октябрь") || month.equals("ноябрь")) {
            System.out.println("Месяц " + month + " относится к осени.");
        } else {
            System.out.println("Ошибка: Вы ввели некорректное название месяца!");
        }

        scanner.close();
    }
}
