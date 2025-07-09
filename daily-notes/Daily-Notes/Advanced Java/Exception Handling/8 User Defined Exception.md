# User Defined Exceptions
---

## 🧠 What is a User-Defined Exception?

A **user-defined exception** is a custom error type you create by extending Java’s built-in exception classes. It's useful when you want your application to express meaningful, domain-specific problems—like “age not eligible” instead of just a generic `Exception`.

This approach enhances **readability**, **debuggability**, and **professionalism** in your codebase.

---

## ✌️ Two Ways to Create a Custom Exception

Java offers two paths:

| Approach                    | Base Class        | Type            | Requires `throws` | Must Catch |
|-----------------------------|-------------------|------------------|--------------------|------------|
| 1. Checked Exception        | `Exception`       | Compile-time     | ✅ Yes             | ✅ Yes     |
| 2. Unchecked Exception      | `RuntimeException`| Runtime          | ❌ No              | ❌ No      |

Now let’s walk through both, using `AgeNotEligibleException` 👇

---

## 🔍 Approach 1: Checked Exception

### ✅ Step-by-Step

1. **Create a class** extending `Exception`
2. **Use `throw`** to trigger it
3. **Declare using `throws`** in the method signature
4. **Handle using `try-catch`**

```java
// Step 1: Custom checked exception
class AgeNotEligibleException extends Exception {
    public AgeNotEligibleException(String message) {
        super(message);
    }
}

// Step 2–4: Using it in a class
public class CheckedAgeValidator {

    public static void main(String[] args) {
        try {
            validateAge(16); // Try setting this to 18+
            System.out.println("Eligible for registration.");
        } catch (AgeNotEligibleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgeNotEligibleException {
        if (age < 18) {
            throw new AgeNotEligibleException("Age is below 18. Not eligible!");
        }
    }
}
```

### 🧾 Notes

- `throws` in `validateAge` is required for checked exceptions.
- You must **catch** this exception explicitly or propagate it further.
- Great for cases where you expect calling methods to handle it.

---

## ⚡ Approach 2: Unchecked Exception

### ✅ Step-by-Step

1. **Extend `RuntimeException`**
2. **Throw directly** from anywhere
3. **No need for `throws` or mandatory catching**

```java
// Step 1: Custom unchecked exception
class AgeNotEligibleRuntimeException extends RuntimeException {
    public AgeNotEligibleRuntimeException(String message) {
        super(message);
    }
}

// Step 2–3: Use it in a class
public class UncheckedAgeValidator {

    public static void main(String[] args) {
        validateAge(16); // Try setting this to 18+
        System.out.println("Validation complete.");
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new AgeNotEligibleRuntimeException("Must be at least 18 to register.");
        }
    }
}
```

### 🧾 Notes

- Ideal for cases where you don’t expect calling methods to recover or handle it.
- Cleaner and shorter, but be cautious: unchecked exceptions can be forgotten unless documented well.

---

## ✅ Which One to Use?

- Use **checked exceptions** when the caller is expected to handle the scenario (e.g., validating age before submitting a form).
- Use **unchecked exceptions** for programming errors or conditions you don’t expect to recover from (e.g., internal logic violations).

---