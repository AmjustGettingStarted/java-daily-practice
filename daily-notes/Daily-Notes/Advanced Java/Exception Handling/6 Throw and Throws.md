# Throw and Throws



Java's exception handling mechanism ensures programs can manage runtime anomalies gracefully. Two keywords central to this system are `throw` and `throws`, and while they look similar, their roles are quite distinct.

### 🔹 `throw`: Raising an Exception

- The `throw` keyword is used **within a method or block** to explicitly **initiate an exception**.
- It represents the **action** of "throwing" a specific exception object at runtime.
- Typically used when your logic detects an invalid condition (like dividing by zero or null access) and you want to exit early with a meaningful error.

💡 Think of `throw` as pulling the fire alarm—you’ve found something wrong and are signaling that it needs attention immediately.

---

### 🔹 `throws`: Declaring Potential Exceptions

- The `throws` keyword is used **in a method signature** to **declare** that the method might result in one or more exceptions.
- This informs the compiler and users of the method that certain types of exceptions must be anticipated or handled externally.
- It's part of Java's **checked exception** model—some exceptions **must** be declared and handled, unlike unchecked ones.

💡 Think of `throws` as a warning label—it’s telling everyone who uses that method: “Hey, this could go wrong, be prepared!”

---

### 🔁 How They Work Together

- A method may use `throw` internally to **create and send** an exception.
- The method must then declare the possibility of that exception using `throws`, or handle it with a `try-catch`.

These two keywords are like teammates—`throw` is the one who fires off the signal, while `throws` is the one who makes sure the signal is expected and properly routed.

---

## Example:

```java
public class CustomThrowExample {

    public static void main(String[] args) {
        try {
            validateAge(15); // Try passing an age below the limit
            System.out.println("Validation passed!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // This method declares that it might throw an IllegalArgumentException
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Actively throw an exception if condition isn't met
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible for the activity.");
    }
}
```

This example showcases:

- `throws` in the method signature to **declare** a potential exception.
- `throw` inside the method body to **actually raise** the exception when a condition fails.

Let me know if you’d like to flip this into a functional programming style or even refactor it using method references!