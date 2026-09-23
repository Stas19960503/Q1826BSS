package lesson5ofis;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {

    private final List<Employee> subordinates = new ArrayList<>();

    public Director(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience);
    }

    @Override
    public void setPosition(Position position) {
        if (position == Position.DIRECTOR) {
            this.position = position;
        } else {
            System.out.println("Ошибка: директор может иметь только должность DIRECTOR!");
        }
    }

    public void addWorker(Employee employee) {
        if (employee != null) {
            subordinates.add(employee);
        }
    }

    @Override
    public double calculateSalary() {
        if (position == null) return 0;
        double baseSalary = BASE_RATE * position.getCoefficient() * (1 + experience * 0.1);
        double bonusForWorkers = 1 + subordinates.size() * 0.05;
        return baseSalary * bonusForWorkers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("========================================\n");
        sb.append("ДИРЕКТОР\n");
        sb.append("========================================\n");
        sb.append("Полное имя: ").append(getFullName()).append("\n");
        sb.append("Должность: ").append(position).append("\n");
        sb.append("Стаж: ").append(experience).append(" лет\n");
        sb.append("Зарплата: ").append(calculateSalary()).append(" руб.\n");
        sb.append("Количество подчинённых: ").append(subordinates.size()).append("\n");

        if (subordinates.isEmpty()) {
            sb.append("\nПодчинённых нет.\n");
        } else {
            sb.append("\n--- СВЕДЕНИЯ О ПОДЧИНЁННЫХ ---\n");
            int i = 1;
            for (Employee emp : subordinates) {
                sb.append("\nПодчинённый #").append(i).append(":\n");
                sb.append("  ").append(emp.toString()).append("\n");
                i++;
            }
        }

        sb.append("========================================");
        return sb.toString();
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
