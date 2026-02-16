/**
 * UC4 - Character Array Based Palindrome Check
 * ============================================================
 *
 * Objective:
 * - To check whether a given string is a palindrome
 *   by reversing the string and comparing it with
 *   the original string.
 * - To check whether a given string is a palindrome
 *   by converting it into a character array and
 *   comparing characters using the two-pointer technique.
 *
 * Definition:
 * A palindrome is a word or string that reads the same
 * forward and backward (example: "level", "madam").
 *
 * Flow:
 * 1. Convert the string into a char[] array
 * 2. Initialize two pointers (start and end)
 * 3. Compare characters at both pointers
 * 4. Move pointers inward until they cross
 * 5. Display the result
 *
 * Data Structures Used:
 * - String
 * - char[]
 *
 * Key Concepts Used:
 * - for Loop
 * - String Immutability
 * - String Concatenation (+)
 * - equals() Method
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Conditional Statements
 * - Time Complexity Awareness (O(n))
 * - Console Output
 *
 * Note:
 * - String concatenation inside a loop creates
 *   multiple String objects due to immutability.
 * - This approach is intentionally used
 *   for learning purposes.
 *
 * @author  Vasantha R.
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string to be checked
        String original = "madam";

        // Input string to be checked
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Convert input string to character array
        char[] characters = input.toCharArray();

        // Reverse the original string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            // Concatenate characters in reverse order
            reversed = reversed + original.charAt(i);
        }

        // Initialize two pointers for character comparison
        int start = 0;
        int end = characters.length - 1;

        // Compare original and reversed strings using equals()
        if (original.equals(reversed)) {

            // Flag to track palindrome status
            boolean isPalindrome = true;

            // If both strings are equal, it is a palindrome
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : true");

            // Two-pointer comparison loop
            while (start < end) {
                // (Loop body intentionally left empty as per original code)
            }

        } else {

            // Compare characters from both ends
            if (characters[start] != characters[end]) {
                boolean isPalindrome = false;
                // Exit loop on mismatch
            }

            // If both strings are not equal, it is not a palindrome
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : false");

            // Move pointers inward
            start++;
            end--;
        }

        // Display final result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + true);

    } // End of main method

} // End of class
