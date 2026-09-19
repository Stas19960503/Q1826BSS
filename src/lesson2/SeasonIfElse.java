package lesson2;

import java.util.Scanner;

public class SeasonIfElse {

    enum Season {
        WINTER("зима"),
        SPRING("весна"),
        SUMMER("лето"),
        AUTUMN("осень");

        private final String russianName;

        Season(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }
    }

    enum Month {
        DECEMBER("декабрь", Season.WINTER),
        JANUARY("январь", Season.WINTER),
        FEBRUARY("февраль", Season.WINTER),

        MARCH("март", Season.SPRING),
        APRIL("апрель", Season.SPRING),
        MAY("май", Season.SPRING),

        JUNE("июнь", Season.SUMMER),
        JULY("июль", Season.SUMMER),
        AUGUST("август", Season.SUMMER),

        SEPTEMBER("сентябрь", Season.AUTUMN),
        OCTOBER("октябрь", Season.AUTUMN),
        NOVEMBER("ноябрь", Season.AUTUMN);

        private final String russianName;
        private final Season season;

        Month(String russianName, Season season) {
            this.russianName = russianName;
            this.season = season;
        }

        public String getRussianName() {
            return russianName;
        }

        public Season getSeason() {
            return season;
        }

        public static Month fromRussianName(String name) {
            for (Month m : values()) {
                if (m.russianName.equals(name)) {
                    return m;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");

        String input = scanner.nextLine().trim().toLowerCase();
        Month month = Month.fromRussianName(input);

        if (month == null) {
            System.out.println("Ошибка: Вы ввели некорректное название месяца!");
        } else {
            switch (month.getSeason()) {
                case WINTER:
                    System.out.println("Месяц " + month.getRussianName() + " относится к зиме.");
                    break;
                case SPRING:
                    System.out.println("Месяц " + month.getRussianName() + " относится к весне.");
                    break;
                case SUMMER:
                    System.out.println("Месяц " + month.getRussianName() + " относится к лету.");
                    break;
                case AUTUMN:
                    System.out.println("Месяц " + month.getRussianName() + " относится к осени.");
                    break;
            }
        }

        scanner.close();
    }
}
