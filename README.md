
# PalindromeCheckerAppManagementSystem


# 🚀 Palindrome Checker App

The **Palindrome Checker App** is a console-based Java application designed to
validate whether a given string is a **palindrome** using multiple approaches.
This project strengthens core Java fundamentals, string handling, and data
structure concepts through **progressive use cases**.

---

## 🔹 UC7 – Deque-Based Optimized Palindrome Check

### 🎯 Objective
To determine whether a given string is a palindrome using a  
**Deque (Double Ended Queue)**.

This approach compares characters from **both ends efficiently** without
reversing the string, making it more optimized than earlier methods.

---

## 🔄 Application Flow
1. Program starts
2. Input string is declared and initialized
3. A Deque is created
4. Each character of the string is inserted into the Deque
5. First and last characters are removed
6. Removed characters are compared
7. The process continues until all characters are checked
8. If all characters match, the string is a palindrome
9. Result is displayed on the console
10. Program exits

---

## 🧠 Key Concepts Used

### Deque Data Structure
A **Double Ended Queue** that allows insertion and deletion from both
the front and the rear.

### addLast() Operation
Inserts characters at the **rear** of the deque.

### removeFirst() Operation
Removes characters from the **front** of the deque.

### removeLast() Operation
Removes characters from the **rear** of the deque.

### Bidirectional Comparison
Enables direct comparison of first and last characters efficiently.

### Optimized Approach
Eliminates the need for separate reversal structures such as **Stack**.

### Time Complexity Awareness
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

### Console Output
Uses `System.out.println()` to display results.

---

## 🧩 Data Structure Used
- `Deque<Character>`

---

## ▶️ Sample Input and Output

**Input:**
