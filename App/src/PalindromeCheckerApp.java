/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Objective:
 * - To check whether a given string is a palindrome
 *   using a Stack data structure.
 * - Use Case 5: Stack Based Palindrome Checker
 *
 * Definition:
 * A palindrome is a word that reads the same forward
 * and backward (example: "level", "madam", "noon").
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO
 * (Last In First Out) principle.
 *
 * Flow:
 * 1. Convert the string into a char[] array
 * 2. Push all characters into a Stack
 * 3. Pop characters from the Stack
 * 4. Compare popped characters with original sequence
 * 5. Display the result
 *
 * Data Structure Used:
 * - char[]
 * - Stack<Character>
 *
 * Key Concepts Covered:
 * - Stack (LIFO)
 * - Character Array (char[])
 * - Array Indexing
 * - Conditional Statements
 * - Looping (for, while)
 * - Time Complexity Awareness (O(n))
 * - Console Output
 *
 * @author  Vasantha R.
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Input string to be checked
        String input = "noon";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Flag to track palindrome status
        // Assume palindrome initially
        boolean isPalindrome = true;

        // Index pointer for original string comparison
        int index = 0;

        // Compare characters by popping from stack
        while (!stack.isEmpty()) {

            // Pop character from stack
            char poppedChar = stack.pop();

            // Compare with original character
            if (characters[index] != poppedChar) {
                isPalindrome = false;
                break; // Exit loop on mismatch
            }

            index++; // Move to next character
        }

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    } // End of main method

} // End of class
