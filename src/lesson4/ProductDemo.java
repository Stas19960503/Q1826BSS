package lesson4;

public class ProductDemo {
    public static void main(String[] args) {

        System.out.println("=== Создаем товар через МИНИМАЛЬНЫЙ конструктор ===");
        Product p1 = new Product("Молоко");
        p1.printInfo();

        System.out.println("\n=== Создаем товар через КОРОТКИЙ конструктор ===");
        Product p2 = new Product("Хлеб", 45.50);
        p2.printInfo();

        System.out.println("\n=== Создаем товар через ПОЛНЫЙ конструктор ===");
        Product p3 = new Product("Сыр", 320.00, 5);
        p3.printInfo();
    }
}
