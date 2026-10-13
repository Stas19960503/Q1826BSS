package lesson9.additional;

public class PalindromeChecker {

    /**
     * Проверяет, является ли строка палиндромом.
     * Игнорирует пробелы, знаки препинания и регистр.
     *
     * @param text строка для проверки
     * @return true, если палиндром; false, если нет
     */
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String cleaned = text.toLowerCase().replaceAll("[^a-zа-яё]", "");

        if (cleaned.length() <= 1) {
            return true;
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
