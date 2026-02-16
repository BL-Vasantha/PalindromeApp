
# PalindromeCheckerAppManagementSystem

# 🚀 Palindrome Checker App

The **Palindrome Checker App** is a console-based Java application designed to
validate whether a given string is a **palindrome** using multiple approaches.

This project strengthens **core Java fundamentals**, **string handling**, and
**data structure concepts** through **progressive use cases**.

---

# UC9 – Recursive Palindrome Checker

## 📌 Overview
UC9 demonstrates how to check whether a given string is a **palindrome**
using **recursion** in Java.

The program accepts user input from the console and validates the string
by comparing characters from the beginning and the end recursively.

---

## 🎯 Objective
- To check whether a given string is a palindrome
- To understand **recursion** and base conditions
- To practice string handling in Java
- To accept user input using `Scanner`
- To display the result on the console

---

## 📖 What is a Palindrome?
A **palindrome** is a word or string that reads the same forward and backward.

### Examples:
- `level`
- `madam`
- `refer`
- `noon`

---

## 🧠 Description
In this use case:
- The user enters a string through the console
- The input is normalized (spaces removed and case ignored)
- A recursive method compares characters from both ends
- On each recursive call, the comparison moves inward
- If all characters match, the string is a palindrome

---

## 🔄 Program Flow
1. Program starts
2. User enters a string
3. Input string is normalized
4. Recursive function is called with start and end indexes
5. Characters at both ends are compared
6. Recursive calls continue until base condition is met
7. Result is displayed on the console
8. Program ends

---

## 🧱 Technique Used
- **Recursion**
- Character comparison using indexes

---

## 🧠 Key Concepts Covered
- Recursion
- Base conditions in recursion
- String manipulation
- User input using `Scanner`
- Conditional statements (`if`)
- Console output (`System.out.println`)
- Time Complexity Awareness – **O(n)**

---

## ⚠️ Important Notes
- Recursion stops when all characters are checked
- If any mismatch is found, recursion returns `false`
- This approach is used to understand **recursive problem-solving**
- Not intended for very large strings due to stack limitations

---


