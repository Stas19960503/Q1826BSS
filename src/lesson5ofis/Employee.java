package lesson5ofis;

public abstract class Employee extends Person {

    protected static final double BASE_RATE = 1000.0;

    protected Position position;
    protected int experience;

    public Employee(String firstName, String lastName, int experience) {
        super(firstName, lastName);
        this.experience = experience;
    }

    public abstract void setPosition(Position position);

    public double calculateSalary() {
        if (position == null) {
            return 0;
        }
        return BASE_RATE * position.getCoefficient() * (1 + experience * 0.1);
    }

    public void printInfo() {
        System.out.println("Имя: " + getFullName());  // getFullName() из Person
        System.out.println("Должность: " + position);
        System.out.println("Коэффициент: " + position.getCoefficient());
        System.out.println("Стаж: " + experience + " лет");
        System.out.println("Зарплата: " + calculateSalary() + " руб.");
    }

    public Position getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }
}
