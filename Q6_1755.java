import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        String palindrome = makePalindrome(input);
        System.out.println(palindrome);
    }

    public static String makePalindrome(String input) {
        // Count the frequency of characters
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        Character middleChar = null;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();

            if (count % 2 == 0) {
                // If the count is even, add half of them to both halves
                int halfCount = count / 2;
                firstHalf.append(String.valueOf(character).repeat(halfCount));
                secondHalf.insert(0, String.valueOf(character).repeat(halfCount));
            } else {
                // If the count is odd, check if we've already found a character with odd count
                if (middleChar == null) {
                    middleChar = character;
                    int halfCount = (count - 1) / 2;
                    firstHalf.append(String.valueOf(character).repeat(halfCount));
                    secondHalf.insert(0, String.valueOf(character).repeat(halfCount));
                } else {
                    // If there are multiple characters with odd counts, it's impossible to form a palindrome
                    return "NO SOLUTION";
                }
            }
        }

        if (middleChar != null) {
            return firstHalf.toString() + middleChar + secondHalf.toString();
        } else {
            return firstHalf.toString() + secondHalf.toString();
        }
    }
}