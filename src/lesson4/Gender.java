package lesson4;

public enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");

    private final String russianName;

    Gender(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
