package lesson4;

public class Calculator {

    public int multiply(int a, int b) {
        System.out.println("-> Вызван multiply(int, int)");
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        System.out.println("-> Вызван multiply(int, int, int)");
        return a * b * c;
    }

    public double multiply(double a, double b) {
        System.out.println("-> Вызван multiply(double, double)");
        return a * b;
    }

    public double multiply(int a, double b) {
        System.out.println("-> Вызван multiply(int, double)");
        return a * b;
    }

    public double multiply(double a, int b) {
        System.out.println("-> Вызван multiply(double, int)");
        return a * b;
    }
}
