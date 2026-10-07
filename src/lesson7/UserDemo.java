package lesson7;

import java.util.*;

public class UserDemo {
    public static void main(String[] args) {

        User user1 = new User("Анна", "женский", 25);
        User user2 = new User("Борис", "мужской", 30);
        User user3 = new User("Анна", "женский", 22);
        User user4 = new User("Виктор", "мужской", 25);
        User user5 = new User("Галина", "женский", 30);
        User user6 = new User("Анна", "женский", 25);

        System.out.println("========== equals и hashCode ==========");
        System.out.println("user1.equals(user3): " + user1.equals(user3));
        System.out.println("user1.equals(user6): " + user1.equals(user6));
        System.out.println("hashCode user1: " + user1.hashCode());
        System.out.println("hashCode user6: " + user6.hashCode());

        System.out.println("\n========== Comparable ==========");
        System.out.println("user1.compareTo(user2): " + user1.compareTo(user2));
        System.out.println("user1.compareTo(user3): " + user1.compareTo(user3));

        System.out.println("\n========== LIST ==========");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        System.out.println("Размер List: " + userList.size());
        for (User u : userList) {
            System.out.println("  " + u);
        }

        System.out.println("\n========== SET ==========");
        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
        userSet.add(user6);
        System.out.println("Размер Set: " + userSet.size());
        for (User u : userSet) {
            System.out.println("  " + u);
        }

        System.out.println("\n========== СЕРВИС на List ==========");
        UserService service = new UserService();
        service.addUser(user1);
        service.addUser(user2);
        service.addUser(user3);
        service.addUser(user4);
        service.addUser(user5);
        service.addUser(user6);

        System.out.println("\n--- Поиск по имени \"Анна\" (дубликаты) ---");
        List<User> annas = service.findByName("Анна");
        System.out.println("Найдено: " + annas.size());
        for (User u : annas) {
            System.out.println("  " + u);
        }

        System.out.println("\n--- Поиск по полу \"женский\" ---");
        List<User> women = service.findByGender("женский");
        for (User u : women) {
            System.out.println("  " + u);
        }

        System.out.println("\n--- Сортировка по возрасту ---");
        List<User> sorted = service.getSortedByAge();
        for (User u : sorted) {
            System.out.println("  " + u);
        }

        System.out.println("\n========== ЗАМЕНА РЕАЛИЗАЦИИ: List → Set ==========");
        Set<User> userSetForService = new HashSet<>(userList);   // дубликат отфильтрован
        service.setUsers(userSetForService);

        System.out.println("Размер коллекции в сервисе после замены: "
                + service.getUsers().size());   // 5

        System.out.println("\n--- Поиск по имени \"Анна\" после замены ---");
        List<User> annasAfter = service.findByName("Анна");
        System.out.println("Найдено: " + annasAfter.size());   // 2 (дубликат убран)
        for (User u : annasAfter) {
            System.out.println("  " + u);
        }

        System.out.println("\n--- Сортировка по возрасту после замены ---");
        List<User> sortedAfter = service.getSortedByAge();
        for (User u : sortedAfter) {
            System.out.println("  " + u);
        }

        System.out.println("\n========== ЗАМЕНА РЕАЛИЗАЦИИ: Set → LinkedList ==========");
        service.setUsers(new LinkedList<>(userSetForService));
        System.out.println("Размер: " + service.getUsers().size());

        List<User> sortedLinked = service.getSortedByAge();
        System.out.println("Сортировка работает: ");
        for (User u : sortedLinked) {
            System.out.println("  " + u);
        }
    }
}
