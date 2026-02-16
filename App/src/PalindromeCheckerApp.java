
/**
 * ============================================================
 *
 * UC2 - Print a Hardcoded Palindrome Result
 * ============================================================
 *
 * This class is the entry point of the application.
 * It only displays a welcome message and version details.
 * No palindrome logic is implemented at this stage.
 * Objective:
 * To check whether a hardcoded string is a palindrome
 * and display the result on the console.
 *
 * A palindrome is a string that reads the same
 * forward and backward (example: "madam").
 *
 * Data Structure Used:
 * String
 *
 * Key Concepts:
 * - Class
 * - Main Method
 * - Static Keyword
 * - String & String Literal
 * - Conditional Statement (if-else)
 * - Loop (for)
 * - Console Output
 *
 * @author Vasantha .R
 *
 * @version 2.0
 */

// Declares a public class named PalindromeCheckerApp
public class PalindromeCheckerApp {

    /**
     * main() method – program execution starts here
     * Main method – Entry point of the Java application.
     * The JVM invokes this method without creating
     * an object of the class because it is static.
     *
     * @param args Command-line arguments (not used here)
     * @param args Command-line arguments
     */

    // JVM starts execution from this method
    public static void main(String[] args) {

        // Prints a separator line on the console
        System.out.println("====================================");
        // Hardcoded string literal to be checked
        String input = "madam";

        // Prints the welcome message
        System.out.println("  Welcome to Palindrome Checker Management System ");
        // Boolean flag to track palindrome status
        boolean isPalindrome = true;

        // Prints the application version
        System.out.println("  Application Version : 1.0");
        // Loop only till half of the string length
        // This improves performance by avoiding full reversal
        for (int i = 0; i < input.length() / 2; i++) {

            // Prints another separator line
            System.out.println("====================================");
            // Compare characters from beginning and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false; // Not a palindrome
                break;               // Exit loop early on mismatch
            }
        }

        // Confirms that the system started successfully
        System.out.println(" System Initialized Successfully.");
        // Display input and result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    } // End of main method

} // End of class