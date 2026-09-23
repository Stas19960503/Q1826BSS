package lesson5ofis;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = new Person("Иван", "Петров");

        String fullName = person.getFullName();
        System.out.println("Полное имя: " + fullName);
    }
}
