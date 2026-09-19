package lesson4;

public class DeprecatedDemo {
    public static void main(String[] args) {

        OldCalculator calc = new OldCalculator();

        int result1 = calc.sum(5, 3);
        System.out.println("Результат через старый метод sum(): " + result1);

        int result2 = calc.add(10, 20);
        System.out.println("Результат через новый метод add(): " + result2);
    }
}
