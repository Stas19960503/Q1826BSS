package lesson4;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Результат 1: " + calc.multiply(5, 3));
        System.out.println("Результат 2: " + calc.multiply(2, 3, 4));
        System.out.println("Результат 3: " + calc.multiply(2.5, 4.0));
        System.out.println("Результат 4: " + calc.multiply(3, 2.5));
        System.out.println("Результат 5: " + calc.multiply(2.5, 4));
    }
}
