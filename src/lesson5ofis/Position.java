package lesson5ofis;

public enum Position {
    DIRECTOR(2.0),
    WORKER(1.0);

    private final double coefficient;

    Position(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
