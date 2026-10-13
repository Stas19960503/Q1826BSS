package lesson9.additional;

public class PalindromeDemo {
    public static void main(String[] args) {

        String[] tests = {
                "Аргентина манит негра",
                "А роза упала на лапу Азора",
                "Мадам, я Аргентинец",
                "Шалаш",
                "Hello",
                "А",
                ""
        };

        for (String test : tests) {
            boolean result = PalindromeChecker.isPalindrome(test);
            System.out.println("\"" + test + "\" → " + (result ? "палиндром" : "не палиндром"));
        }
    }
}
