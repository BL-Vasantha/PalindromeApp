/**
 * UC3 - Palindrome Check Using String Reverse
 * ============================================================
 *
 * Objective:
 * - To check whether a hardcoded string is a palindrome
 * - To reverse a string and compare it with the original string
 * - To display the result on the console
 *
 * Definition:
 * A palindrome is a string that reads the same forward
 * and backward (example: "madam").
 *
 * Data Structure Used:
 * - String
 *
 * Key Concepts Covered:
 * - Class and Main Method
 * - Static Keyword
 * - String and String Literals
 * - Conditional Statements (if-else)
 * - for Loop
 * - String Immutability
 * - String Concatenation (+)
 * - equals() method
 * - Console Output
 *
 * Note:
 * - String concatenation inside a loop creates multiple
 *   String objects due to String immutability.
 * - This approach is intentionally used for learning purposes.
 *
 * @author  Vasantha R.
 * @version 3.0
 */
public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     * The JVM invokes this method without creating
     * an object of the class because it is static.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string literal to be checked
        String input = "madam";

        // Original string for reverse comparison
        String original = "madam";

        // Boolean flag to track palindrome status
        boolean isPalindrome = true;

        /*
         * Loop only till half of the string length.
         * This improves performance by avoiding
         * unnecessary full traversal.
         */
        for (int i = 0; i < input.length() / 2; i++) {

            // Variable to store reversed string
            String reversed = "";

            // Compare characters from beginning and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false; // Not a palindrome
                break;                // Exit loop early on mismatch
            }

            // Reverse the string using a for loop
            for (int j = original.length() - 1; j >= 0; j--) {
                // Concatenate characters in reverse order
                reversed = reversed + original.charAt(j);
            }

            // Display input and palindrome status
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            // Compare original and reversed strings using equals()
            if (original.equals(reversed)) {

                // If both strings are equal, it is a palindrome
                System.out.println("Input text: " + original);
                System.out.println("Is it a Palindrome? : true");

            } else {

                // If both strings are not equal, it is not a palindrome
                System.out.println("Input text: " + original);
                System.out.println("Is it a Palindrome? : false");
            }
        }
    }
}
