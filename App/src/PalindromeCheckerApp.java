import java.util.Scanner;

/**
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * using recursion.
 *
 * The string is compared character-by-character from
 * the beginning and the end, moving inward on each
 * recursive call.
 *
 * This use case demonstrates:
 * - Recursion
 * - Base conditions
 * - String handling
 * - User input using Scanner
 *
 * @author  Vasantha R
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read input string from user
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces and ignore case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using recursion
        boolean result = checkPalindrome(input, 0, input.length() - 1);

        // Display result
        System.out.println("Is Palindrome? : " + result);

        // Close scanner
        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean checkPalindrome(String s, int start, int end) {

        // Base Condition 1: All characters checked
        if (start >= end) {
            return true;
        }

        // Base Condition 2: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(s, start + 1, end - 1);
    }

} // End of class
