package lesson9.textanalyzer;

import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);

        String longest = "";
        for (String word : words) {
            String clean = word.replaceAll("[^A-Za-zА-Яа-яЁё]", "");
            if (clean.length() > longest.length()) {
                longest = clean;
            }
        }
        System.out.println("Самое длинное слово: " + longest);

        Map<Character, Integer> frequency = new TreeMap<>();
        String lower = text.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (Character.isLetter(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }
        StringBuilder freqLine = new StringBuilder("Частота букв: ");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            freqLine.append(entry.getKey()).append(": ")
                    .append(entry.getValue()).append(", ");
        }
        if (freqLine.length() > 0) {
            freqLine.setLength(freqLine.length() - 2);
        }
        System.out.println(freqLine);

        StringBuilder reversedText = new StringBuilder();
        for (String word : words) {
            reversedText.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("Текст с перевёрнутыми словами: " + reversedText.toString().trim());

        String cleaned = text.toLowerCase().replaceAll("[^a-zа-яё]", "");
        String reversedCleaned = new StringBuilder(cleaned).reverse().toString();
        boolean isPalindrome = cleaned.equals(reversedCleaned);
        System.out.println("Текст является палиндромом: " + (isPalindrome ? "Да" : "Нет"));

        scanner.close();
    }
}
