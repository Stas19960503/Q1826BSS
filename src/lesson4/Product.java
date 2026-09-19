package lesson4;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        System.out.println("-> Вызван ПОЛНЫЙ конструктор (name, price, quantity)");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this(name, price, 1);
        System.out.println("-> Вызван КОРОТКИЙ конструктор (name, price), который вызвал полный");
    }

    public Product(String name) {
        this(name, 0.0, 1);
        System.out.println("-> Вызван МИНИМАЛЬНЫЙ конструктор (name), который вызвал полный");
    }

    public void printInfo() {
        System.out.println("Товар: " + name + " | Цена: " + price + " | Количество: " + quantity);
    }
}
