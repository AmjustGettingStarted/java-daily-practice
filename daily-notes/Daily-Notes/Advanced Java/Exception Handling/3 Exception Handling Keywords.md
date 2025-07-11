# ⚠️ Exception Handling Keywords

Exception handling is crucial to building robust Java applications that can gracefully handle runtime errors. Below is a guide to the core exception-related keywords:

---

## 🔹 `try`

Used to define a block of code that might throw exceptions.

```java
try {
    // Code that might cause an exception
}
```

💡 The `try` block wraps around risky operations that need monitoring.

---

## 🔹 `catch`

Used to handle specific exceptions that occur in the `try` block.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
```

💡 You can use multiple `catch` blocks to manage various exception types.

---

## 🔹 `finally`

Defines a block of code that is always executed, whether an exception occurs or not.

```java
try {
    // risky code
} catch (Exception e) {
    System.out.println("Caught an exception");
} finally {
    System.out.println("Cleanup code runs regardless");
}
```

💡 Ideal for releasing resources, closing files, or resetting values.

---

## 🔹 `throw`

Used to explicitly throw an exception.

```java
throw new IllegalArgumentException("Invalid input");
```

💡 Allows manual triggering of exceptions for custom error handling.

---

## 🔹 `throws`

Declares the exceptions that a method can throw.

```java
void readFile() throws FileNotFoundException {
    Scanner s = new Scanner(new File("file.txt"));
}
```

> 💡 Helps communicate to the caller that they must handle specific exceptions.

---

## 📌 Summary Table

| Keyword   | Role                         | Requires Handling | Used In                |
| --------- | ---------------------------- | ----------------- | ---------------------- |
| `try`     | Define risky block           | Yes               | Inside method block    |
| `catch`   | Handle exception             | Yes               | After `try` block      |
| `finally` | Always execute cleanup       | No                | After `catch` or `try` |
| `throw`   | Manually trigger exception   | Yes               | Inside method body     |
| `throws`  | Declare potential exceptions | Yes               | Method signature       |

---

> 🌟 Exception handling is your safety net in Java—use it wisely for clean, crash-resistant code!
