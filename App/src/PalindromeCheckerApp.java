/**
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: LinkedList Based Palindrome Checker
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the LinkedList and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an efficient
 * front-to-back comparison approach.
 *
 * This use case demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author  Vasantha R.
 * @version 8.0
 */

import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break; // Exit loop on mismatch
            }
        }

        // Display result
        System.out.println("UC8 - LinkedList Based Palindrome Check");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    } // End of main method

} // End of class
