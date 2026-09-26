package lesson5ofis;

public class Director extends Employee {

    private final Employee[] subordinates = new Employee[100];

    private int count = 0;

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
        if (employee == null) {
            System.out.println("Ошибка: нельзя добавить null вместо сотрудника!");
            return;
        }

        if (count >= subordinates.length) {
            System.out.println("Ошибка: массив подчинённых заполнен!");
            return;
        }

        subordinates[count] = employee;
        count++;

        System.out.println(employee.getFullName() + " добавлен(а) под управление директора "
                + this.getFullName() + ". Всего подчинённых: " + count);
    }

    @Override
    public double calculateSalary() {
        if (position == null) return 0;
        double baseSalary = BASE_RATE * position.getCoefficient() * (1 + experience * 0.1);
        double bonusForWorkers = 1 + count * 0.05;  // используем count, а не subordinates.length
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
        sb.append("Количество подчинённых: ").append(count).append("\n");

        if (count == 0) {
            sb.append("\nПодчинённых нет.\n");
        } else {
            sb.append("\n--- СВЕДЕНИЯ О ПОДЧИНЁННЫХ ---\n");
            for (int i = 0; i < count; i++) {
                sb.append("\nПодчинённый #").append(i + 1).append(":\n");
                sb.append("  ").append(subordinates[i].toString()).append("\n");
            }
        }

        sb.append("========================================");
        return sb.toString();
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }

    public int getCount() {
        return count;
    }
}
