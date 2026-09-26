package lesson5office;

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

        System.out.println("=== УСПЕШНЫЕ ДОБАВЛЕНИЯ ===");

        System.out.println("--- secondDirector берёт worker3 ---");
        secondDirector.addWorker(worker3);

        System.out.println("\n--- mainDirector берёт worker1 ---");
        mainDirector.addWorker(worker1);

        System.out.println("\n--- mainDirector берёт worker2 ---");
        mainDirector.addWorker(worker2);

        System.out.println("\n--- mainDirector берёт secondDirector ---");
        mainDirector.addWorker(secondDirector);

        System.out.println("\n========== ТЕСТЫ С worker1 ==========");

        System.out.println("--- ТЕСТ 1.1: добавить worker1 ещё раз ---");
        mainDirector.addWorker(worker1);

        System.out.println("\n--- ТЕСТ 1.2: добавить worker1 в третий раз ---");
        mainDirector.addWorker(worker1);

        System.out.println("\n--- ТЕСТ 1.3: добавить worker1 четвёртый раз ---");
        mainDirector.addWorker(worker1);

        System.out.println("\n========== ТЕСТЫ С worker2 ==========");

        System.out.println("--- ТЕСТ 2.1: добавить worker2 ещё раз ---");
        mainDirector.addWorker(worker2);

        System.out.println("\n--- ТЕСТ 2.2: добавить worker2 снова ---");
        mainDirector.addWorker(worker2);

        System.out.println("\n========== ТЕСТЫ С worker3 ==========");

        System.out.println("--- ТЕСТ 3.1: добавить worker3 главному директору " +
                "(worker3 уже у второго!) ---");
        mainDirector.addWorker(worker3);

        System.out.println("\n--- ТЕСТ 3.2: добавить worker3 главному директору ЕЩЁ раз ---");
        mainDirector.addWorker(worker3);

        System.out.println("\n--- ТЕСТ 3.3: добавить worker3 второму директору ещё раз ---");
        secondDirector.addWorker(worker3);

        System.out.println("\n========== ТЕСТЫ С secondDirector ==========");

        System.out.println("--- ТЕСТ 4.1: добавить secondDirector ещё раз ---");
        mainDirector.addWorker(secondDirector);

        System.out.println("\n--- ТЕСТ 4.2: добавить secondDirector снова ---");
        mainDirector.addWorker(secondDirector);

        System.out.println("\n========== ТЕСТЫ С null ==========");

        System.out.println("--- ТЕСТ 5.1: добавить null главному директору ---");
        mainDirector.addWorker(null);

        System.out.println("\n--- ТЕСТ 5.2: добавить null второму директору ---");
        secondDirector.addWorker(null);

        System.out.println("\n========== ТЕСТЫ НА ДОБАВЛЕНИЕ СЕБЯ ==========");

        System.out.println("--- ТЕСТ 6.1: mainDirector добавляет сам себя ---");
        mainDirector.addWorker(mainDirector);

        System.out.println("\n--- ТЕСТ 6.2: secondDirector добавляет сам себя ---");
        secondDirector.addWorker(secondDirector);

        System.out.println("\n--- ТЕСТ 6.3: secondDirector добавляет главного директора ---");
        secondDirector.addWorker(mainDirector);

        System.out.println("\n========== ИТОГОВЫЙ ОТЧЁТ ==========");
        System.out.println(mainDirector);

        System.out.println("\n========== ОТЧЁТ ВТОРОГО ДИРЕКТОРА ==========");
        System.out.println(secondDirector);
    }
}
