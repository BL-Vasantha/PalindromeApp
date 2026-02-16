
# PalindromeCheckerAppManagementSystem

# UC8 – LinkedList Based Palindrome Checker

## 📌 Overview
UC8 demonstrates how to check whether a given string is a **palindrome**
using a **LinkedList** in Java.

This approach uses **double-ended operations** provided by `LinkedList`
to compare characters from both ends without reversing the string.

---

## 🎯 Objective
- To check whether a given string is a palindrome
- To use **LinkedList** for symmetric comparison
- To understand how `removeFirst()` and `removeLast()` work
- To strengthen knowledge of Java Collections

---

## 📖 What is a Palindrome?
A **palindrome** is a word or string that reads the same
forward and backward.

### Examples:
- `level`
- `madam`
- `refer`
- `noon`

---

## 🧠 Description
In this use case:
- Each character of the input string is added to a `LinkedList`
- Characters are removed from the **front** and **rear**
- Removed characters are compared
- If all characters match, the string is a palindrome

This avoids explicit string reversal and enables
**efficient bidirectional comparison**.

---

## 🔄 Program Flow
1. Program starts
2. Input string is declared and initialized
3. Characters are added to a `LinkedList`
4. First and last elements are removed
5. Removed characters are compared
6. Process continues until the list size is less than or equal to 1
7. Result is displayed on the console
8. Program ends

---

## 🧱 Data Structure Used
- `LinkedList<Character>`

---

## 🧠 Key Concepts Covered
- LinkedList
- Double-ended operations
- `add()`
- `removeFirst()`
- `removeLast()`
- Looping (`while`)
- Conditional Statements (`if`)
- Time Complexity Awareness – **O(n)**
- Console Output (`System.out.println`)

---

## ⚠️ Important Notes
- This approach avoids reversing the string
- It uses LinkedList’s natural support for front and rear access
- Designed for **learning and clarity**, not micro-optimization

---

## ▶️ Sample Input and Output

**Input:**


## 🧩 Data Structure Used
- `Deque<Character>`

---


