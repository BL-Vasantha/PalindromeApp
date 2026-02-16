
# PalindromeCheckerAppManagementSystem


## 📌 Objective
The objective of the **PalindromeChecker App** is to design and implement a
**console-based Java application** that validates whether a given string is a
palindrome under different conditions, while strengthening **core programming
fundamentals** and **data structure concepts**.

# UC5 – Stack Based Palindrome Checker

## 📌 Overview
This use case demonstrates how to check whether a given string is a **palindrome**
using a **Stack data structure** in Java.

The program follows the **LIFO (Last In First Out)** principle of Stack to reverse
the input string logically and compare it with the original sequence.

---

## 🎯 Objective
- To check whether a given string is a palindrome
- To implement palindrome validation using **Stack**
- To understand stack operations (`push`, `pop`)
- To strengthen knowledge of **data structures** and **string manipulation**
- To display the result on the console

---

## 📖 What is a Palindrome?
A **palindrome** is a word or string that reads the same forward and backward.

### Examples:
- `madam`
- `level`
- `noon`
- `radar`

---

## 🧠 Description
In this use case:
- Characters of the input string are pushed into a stack
- Characters are popped from the stack in reverse order
- Each popped character is compared with the original string
- If all characters match, the string is a palindrome

---

## 🔄 Program Flow
1. Define the input string
2. Convert the string into a `char[]` array
3. Push each character into a `Stack`
4. Pop characters one by one from the stack
5. Compare popped characters with the original array
6. If any mismatch occurs, mark as not a palindrome
7. Display the final result

---

## 🧱 Data Structures Used
- `char[]` – to store characters of the string
- `Stack<Character>` – to reverse characters using LIFO order

---

## 🧠 Key Concepts Covered
- Stack Data Structure
- LIFO Principle
- Stack Operations (`push`, `pop`)
- Character Arrays
- Looping (`for`, `while`)
- Conditional Statements (`if`)
- Time Complexity Awareness – **O(n)**
- Console Output (`System.out.println`)

---

## ⚠️ Important Notes
- Stack is used here to demonstrate **reversal logic**
- This approach is used for **learning purposes**
- More optimized solutions exist, but are intentionally not used
- Focus is on understanding **data structures**, not performance tuning

---

## ▶️ How to Run the Program
1. Compile the Java file:
   ```bash
   javac UseCase5PalindromeCheckerApp.java
