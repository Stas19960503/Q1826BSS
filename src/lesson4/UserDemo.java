package lesson4;

public class UserDemo {
    public static void main(String[] args) {

        User.Address address1 = new User.Address("Беларусь", "Минск");
        User.Address address2 = new User.Address("Россия", "Москва");

        User user1 = new User("Иван", "Петров", 25, Gender.MALE,
                address1);
        User user2 = new User("Мария", "Сидорова", 30, Gender.FEMALE,
                address2);

        System.out.println("=== Пользователь 1 ===");
        user1.printInfo();

        System.out.println("\n=== Пользователь 2 ===");
        user2.printInfo();

        System.out.println("\n=== После дня рождения Ивана ===");
        user1.increaseAge();
        user1.printInfo();
    }
}
