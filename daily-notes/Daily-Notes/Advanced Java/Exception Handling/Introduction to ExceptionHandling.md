# ☂️ Exception Handling in Java

## ⚠️ What is an Error?

Errors are issues that occur during the execution of a program and disrupt the normal flow of instructions. They may be caused by logic flaws, user inputs, or resource failures.

---

## 💣 Types of Errors in Java

There is no types in Error but Error may occur during

- **Compile-Time Errors**: Detected during compilation (e.g. syntax errors, missing classes).
- **Runtime Errors**: Occur during program execution (e.g. divide by zero, null access).
- **Logical Errors**: Program compiles and runs, but gives incorrect results.
- **Out-of-Memory Errors**: Memory exhaustion or overflow conditions.

---
## 🧨 What Is an Exception in Java?


An exception is an unexpected or abnormal event that disrupts the normal flow of a program’s execution.

---

## 🛠️ How to Handle Errors — What’s it Called?

The process of managing errors/exceptions and preventing abrupt termination is called **Exception Handling**. Java provides a structured mechanism to "catch" and "handle" exceptions gracefully, ensuring the program continues or exits cleanly.

---
# ⚠️ Examples of Common Exceptions

- **Divide By Zero**  
  Occurs when a number is divided by zero, which is undefined.

- **Invalid Array Index**  
  Accessing an array element with an out-of-bounds index.

- **Remove from an Empty Container**  
  Attempting to remove an element from an empty data structure like a queue or stack.

- **Add to a Full Container**  
  Trying to add an element to a data structure that is already full.

- **File Not Present**  
  Attempting to access a file that does not exist in the specified location.

---

# ✅ Advantages of Exception Handling

- **Separation from Regular Code (or Logic)**  
  Exception handling separates error-handling logic from the core functionality of the program, ensuring clean and readable code.

- **Propagating the Error Up the Function Call Stack**  
  Errors can be passed up the call stack, allowing the higher levels of the application to decide how to handle specific issues.

- **Grouping and Differentiating Error Conditions**  
  Enables the classification of errors into different types, making it easier to identify and handle specific error conditions.
