package lesson5ofis;

public abstract class Employee {

    protected static final double BASE_RATE = 1000.0;

    protected String firstName;
    protected String lastName;
    protected Position position;
    protected int experience;

    public Employee(String firstName, String lastName, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
    }

    public abstract void setPosition(Position position);

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double calculateSalary() {
        if (position == null) {
            System.out.println("Ошибка: должность не установлена!");
            return 0;
        }
        return BASE_RATE * position.getCoefficient() * (1 + experience * 0.1);
    }

    public void printInfo() {
        System.out.println("Имя: " + getFullName());
        System.out.println("Должность: " + position);
        System.out.println("Коэффициент: " + position.getCoefficient());
        System.out.println("Стаж: " + experience + " лет");
        System.out.println("Зарплата: " + calculateSalary() + " руб.");
    }

    public Position getPosition() { return position; }
    public int getExperience() { return experience; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}
