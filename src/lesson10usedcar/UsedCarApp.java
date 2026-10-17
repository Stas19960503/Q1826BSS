package lesson10usedcar;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsedCarApp {
    public static void main(String[] args) {

        List<CarDealer> dealers = Arrays.asList(
                new CarDealer("АвтоБаза", 35, Arrays.asList(
                        new UsedCar("BMW X5", 2015, true),
                        new UsedCar("Audi A4", 2018, true),
                        new UsedCar("Lada Vesta", 2020, false)
                )),
                new CarDealer("ЛюксАвто", 40, Arrays.asList(
                        new UsedCar("Mercedes E200", 2016, true),
                        new UsedCar("Toyota Camry", 2019, true),
                        new UsedCar("Kia Rio", 2017, true)
                )),
                new CarDealer("Гараж", 50, Arrays.asList(
                        new UsedCar("Ford Focus", 2014, false),
                        new UsedCar("Mazda 6", 2021, true),
                        new UsedCar("Nissan Qashqai", 2018, false),
                        new UsedCar("VW Polo", 2012, true)
                ))
        );

        System.out.println("Автосалоны и асартимент");

        System.out.println("\n1. Автосалоны с 'Авто' в названии:");
        dealers.stream()
                .filter(dealer -> dealer.getName().contains("Авто"))
                .forEach(System.out::println);

        System.out.println("\n2. Автосалоны с более чем 3 машинами:");
        dealers.stream()
                .filter(dealer -> dealer.getCars().size() > 3)
                .forEach(System.out::println);

        System.out.println("\n3. Все модели машин во всех салонах:");
        dealers.stream()
                .flatMap(dealer -> dealer.getCars().stream()) // Превращаем Stream<CarDealer> в Stream<UsedCar>
                .map(UsedCar::getModel)
                .forEach(model -> System.out.print(model + ", "));
        System.out.println();

        System.out.println("\n4. Названия автосалонов капсом:");
        dealers.stream()
                .map(dealer -> dealer.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\n5. Общее количество машин:");
        long totalCars = dealers.stream()
                .flatMap(dealer -> dealer.getCars().stream())
                .count();
        System.out.println("Всего машин: " + totalCars);

        System.out.println("\n6. Map: Салон -> Количество машин");
        Map<String, Integer> carsCountMap = dealers.stream()
                .collect(Collectors.toMap(
                        CarDealer::getName,
                        dealer -> dealer.getCars().size()
                ));
        carsCountMap.forEach((dealerName, count) ->
                System.out.println(dealerName + " -> " + count));
    }
}
