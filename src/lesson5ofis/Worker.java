package lesson5ofis;

public class Worker extends Employee {

    public Worker(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience);
    }

    @Override
    public void setPosition(Position position) {
        if (position == Position.WORKER) {
            this.position = position;
        } else {
            System.out.println("Ошибка: работник может иметь только должность WORKER!");
        }
    }

    @Override
    public String toString() {
        return "Работник: " + getFullName() +
                " | Должность: " + position +
                " | Стаж: " + experience + " лет" +
                " | Зарплата: " + calculateSalary() + " руб.";
    }
}
