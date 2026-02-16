
# PalindromeCheckerAppManagementSystem


## 📌 Objective
The objective of the **PalindromeChecker App** is to design and implement a
**console-based Java application** that validates whether a given string is a
palindrome under different conditions, while strengthening **core programming
fundamentals** and **data structure concepts**.

# UC4 – Character Array Based Palindrome Check

## 📌 Overview
This use case demonstrates how to check whether a given string is a **palindrome**
using two different approaches:
1. **String Reverse Comparison**
2. **Character Array with Two-Pointer Technique**

The program is implemented as a **console-based Java application** and focuses on
strengthening understanding of **strings, arrays, loops, and logical thinking**.

---

## 🎯 Objective
- To check whether a given string is a palindrome
- To reverse a string and compare it with the original string
- To convert a string into a character array (`char[]`)
- To compare characters using the **two-pointer technique**
- To display the result on the console

---

## 📖 What is a Palindrome?
A **palindrome** is a word or string that reads the same forward and backward.

### Examples:
- `madam`
- `level`
- `radar`

---

## 🔄 Program Flow
1. Define the input string
2. Reverse the string using a `for` loop
3. Compare the original and reversed strings using `equals()`
4. Convert the input string into a character array
5. Initialize two pointers (`start` and `end`)
6. Compare characters at both pointers
7. Move pointers inward until they cross
8. Display whether the string is a palindrome

---

## 🧱 Data Structures Used
- `String`
- `char[]` (Character Array)

---

## 🧠 Key Concepts Covered
- Java Class and `main()` Method
- Static Method Execution
- String Immutability
- String Concatenation (`+`)
- `equals()` Method
- Character Arrays
- Array Indexing
- Two-Pointer Technique
- Conditional Statements (`if-else`)
- Looping (`for`, `while`)
- Time Complexity Awareness – **O(n)**
- Console Output (`System.out.println`)

---

## ⚠️ Important Note
- String concatenation inside a loop creates **multiple String objects**
  due to **String immutability**.
- This approach is intentionally used **for learning purposes**.
- Optimized approaches (like `StringBuilder`) are not used here.

---

## ▶️ How to Run the Program
1. Compile the Java file:
   ```bash
   javac PalindromeCheckerApp.java
