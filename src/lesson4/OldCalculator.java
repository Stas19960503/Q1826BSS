package lesson4;

public class OldCalculator {

    /**
     * @deprecated Этот метод устарел. Используйте {@link #add(int, int)} вместо него.
     * Оставлен для обратной совместимости со старым кодом.
     */
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
