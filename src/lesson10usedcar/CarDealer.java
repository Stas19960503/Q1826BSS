package lesson10usedcar;

import java.util.List;

public class CarDealer {
    private String name;
    private int rating;
    private List<UsedCar> cars;

    public CarDealer(String name, int rating, List<UsedCar> cars) {
        this.name = name;
        this.rating = rating;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public List<UsedCar> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
