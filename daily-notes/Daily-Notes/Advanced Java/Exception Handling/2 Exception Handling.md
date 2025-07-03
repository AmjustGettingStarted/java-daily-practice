# 🎯 Exception Handling Hierarchy

![Exception Hierarchy Diagram](image.png)

---

## 🧱 Object & Throwable

- At the top of the Java exception hierarchy is the **`Object`** class, from which every class in Java inherits.
- Directly beneath `Object` is the **`Throwable`** class—this is the parent of both **Errors** and **Exceptions**.
- The `Throwable` class provides core exception-handling capabilities, like `printStackTrace()`.

### 🔀 `Throwable` is divided into:

1. **Error**
2. **Exception**

---

## ❌ Error

- Errors represent **serious problems** that a reasonable application **should not attempt to catch**.
- These issues are typically related to the **Java Virtual Machine (JVM)** or system-level failures.
- Example scenarios: out-of-memory, stack overflows, and JVM crashes.

---

## ⚠️ Exception

- The `Exception` class is the **base** for all recoverable, application-level issues.
- Exceptions indicate conditions that a program **might want to catch and handle**.
- These are further divided into:

  1. **Checked Exceptions** — Must be handled at compile-time using `try-catch` or declared with `throws`.
  2. **Unchecked Exceptions** — Runtime exceptions that aren’t checked during compilation and may be optionally handled.

---

## ✅ Checked Exceptions

Checked exceptions are those that the **Java compiler checks at compile-time**.

If your code contains operations that might throw a checked exception, you are required to either:

- **Handle it** using a `try-catch` block,
- Or **declare it** using the `throws` keyword in the method signature.

This enforces better error handling and ensures that programs are prepared to manage expected but problematic conditions (like missing files or input/output failures).

---

## 📋 Common Checked Exceptions

1. **`IOException`**  
   Raised when an Input/Output operation fails or is interrupted.

2. **`FileNotFoundException`**  
   A subclass of `IOException`, thrown when the file you're trying to access does not exist.

---

> _The compiler acts as your early-warning system—highlighting potential trouble so your logic can deal with it before runtime chaos ensues._

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class GfG {
    public static void main(String[] args) {
        // Example for checked
        Scanner scanner = new Scanner(new File("a.txt"));
        // The above code will not compile if we do not add exception handling code
        try {
            scanner = new Scanner(new File("a.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

> In this example, the FileNotFoundException must be handled, or the code will not compile.

---

## ⚠️ Unchecked Exceptions

Unchecked exceptions are **not verified at compile-time**, meaning the compiler doesn’t require explicit handling. These typically stem from **programming mistakes** like:

- Logic flaws
- Violating API contracts
- Mismanaging resources

Since they inherit from `RuntimeException`, these exceptions may occur during execution, and the developer chooses whether or not to handle them.

---

## 📋 Common Unchecked Exceptions

- **`ArithmeticException`**  
  Thrown when an illegal arithmetic operation occurs, such as dividing by zero.

- **`NullPointerException`**  
  Raised when trying to access a method or variable through a `null` reference.

- **`IndexOutOfBoundsException`**  
  Occurs when attempting to access an index outside the bounds of an array, string, or collection.

---

> _Unchecked doesn’t mean unimportant—these guys sneak in when you least expect it, so clear coding practices and defensive logic are your best armor 🛡️._

```java
// Array Index Out of Bounds:
class GfG {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[10] = 10; // Throws IndexOutOfBoundsException
    }
}

//Division by Zero:
class GfG {
    public static void main(String[] args) {
        int sum = 100;
        int n = 0;
        int arg = sum / n; // Throws ArithmeticException: / by zero
    }
}
```
