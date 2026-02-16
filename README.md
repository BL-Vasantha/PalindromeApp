
# PalindromeCheckerAppManagementSystem



The Palindrome Checker App is a console-based Java application designed to validate whether a given string is a palindrome using multiple approaches. This project strengthens core Java fundamentals, string handling, and data structure concepts through progressive use cases.

🔹 UC6: Queue + Stack Based Palindrome Check
🎯 Objective
To determine whether a given string is a palindrome using both Queue (FIFO) and Stack (LIFO) data structures. This use case demonstrates the behavioral difference between FIFO and LIFO while validating palindrome logic.

🔄 Application Flow
Program starts
Input string is declared and initialized
A Queue is created (FIFO)
A Stack is created (LIFO)
Each character is inserted into both queue and stack
Characters are removed using dequeue (queue) and pop (stack)
Dequeue and pop values are compared
If all characters match, it is a palindrome
Result is displayed on the console
Program exits
🧠 Key Concepts Used
Queue Data Structure
Follows First In First Out (FIFO) principle.

Stack Data Structure
Follows Last In First Out (LIFO) principle.

Enqueue Operation (queue.add())
Inserts elements into the queue.

Dequeue Operation (queue.remove())
Removes elements from the front of the queue.

Push Operation (stack.push())
Inserts elements into the stack.

Pop Operation (stack.pop())
Removes elements from the top of the stack.

Logical Comparison
Matching dequeue (FIFO) output with pop (LIFO) output validates palindrome logic.

Time Complexity Awareness
Time Complexity: O(n)
Space Complexity: O(n)

Console Output
System.out.println() is used to display results.

🧩 Data Structures Used
Queue
Stack
▶️ Sample Input and Output
Input: civic

Output: Input : civic Is Palindrome? : true

⚙️ How to Compile and Run
Compile: javac UseCase6PalindromeCheckerApp.java

Run: java UseCase6PalindromeCheckerApp

📚 Learning Outcome
Understanding FIFO vs LIFO behavior
Comparing Queue and Stack operations
Applying data structures to solve real problems
Strengthening Java collections knowledge
Deepening understanding of palindrome validation logic