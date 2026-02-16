
# PalindromeCheckerAppManagementSystem


## 📌 Objective
The objective of the **PalindromeChecker App** is to design and implement a
**console-based Java application** that validates whether a given string is a
palindrome under different conditions, while strengthening **core programming
fundamentals** and **data structure concepts**.

## 🚀 Use Case 3 (UC3): Palindrome Check Using String Reverse

### 🎯 Goal
Check whether a string is a palindrome by reversing it.

---

### 🔄 Flow
1. Reverse the string using a loop.
2. Compare the original string with the reversed string.
3. Display the result.
4. Program exits.

---

## 🧠 Key Concepts Used in UC3

- **Loop (for loop)**  
  Used to iterate through the characters of the string in reverse order
  to construct the reversed string.

- **String Immutability**  
  In Java, `String` objects are immutable.  
  Each modification creates a new `String` object in memory.

- **String Concatenation (+)**  
  Used to build the reversed string character by character.  
  This approach is intentionally used to demonstrate its drawbacks,
  which will be improved in later use cases.

- **equals() Method**  
  Used to compare the actual content of two `String` objects rather than
  memory references.

- **Console Output**  
  `System.out.println()` is used to display the input and result.

---

## 🧩 Data Structure Used
- **String**