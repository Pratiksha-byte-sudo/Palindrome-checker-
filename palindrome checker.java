import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Check if the word is a palindrome
        boolean isPalindrome = isPalindrome(word);

        // Display the result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase and remove any non-alphabetic characters
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        // Get the length of the word
        int length = word.length();

        // Compare characters from both ends towards the center
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }
}