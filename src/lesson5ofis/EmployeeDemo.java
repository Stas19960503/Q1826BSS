package lesson5ofis;

public class EmployeeDemo {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Иван", "Петров", 5);
        worker1.setPosition(Position.WORKER);

        Worker worker2 = new Worker("Мария", "Сидорова", 3);
        worker2.setPosition(Position.WORKER);

        Worker worker3 = new Worker("Алексей", "Кузнецов", 8);
        worker3.setPosition(Position.WORKER);

        Director mainDirector = new Director("Ольга", "Смирнова", 12);
        mainDirector.setPosition(Position.DIRECTOR);

        Director secondDirector = new Director("Сергей", "Волков", 10);
        secondDirector.setPosition(Position.DIRECTOR);

        secondDirector.addWorker(worker3);

        mainDirector.addWorker(worker1);
        mainDirector.addWorker(worker2);
        mainDirector.addWorker(secondDirector);

        System.out.println();

        System.out.println(mainDirector);
    }
}
