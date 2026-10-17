package lesson10usedcar;

public class UsedCar {
    private String model;
    private int year;
    private boolean isSold;

    public UsedCar(String model, int year, boolean isSold) {
        this.model = model;
        this.year = year;
        this.isSold = isSold;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", isSold=" + isSold +
                '}';
    }
}
