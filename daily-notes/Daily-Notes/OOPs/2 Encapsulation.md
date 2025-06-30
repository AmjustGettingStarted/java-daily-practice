# 🛡️ Encapsulation in Object-Oriented Programming (OOP)

**Encapsulation** refers to the process of **bundling data (fields)** and **methods** that operate on the data into a single unit, typically a class. It also involves **restricting direct access** to certain components to ensure data integrity and security.

In simpler terms, encapsulation hides implementation details from external classes or packages and only exposes what is necessary.

---

## 📘 Definitions

### 1. Bundling of Data and Methods

- Combines related data and functions into a single class.

### 2. Data Hiding

- Restricts direct access to internal fields using access modifiers (`private`, `protected`, `public`).
- Access is provided through getter and setter methods.

---

## ✅ Advantages of Encapsulation

### 1. Improved Maintainability

Encapsulation allows changes to the internal logic without impacting external code.

```java
class Student {
    private int age;

    public void setAge(int age) {
        // Validation or business logic can go here
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

---

### 2. Consistency

Encapsulation enforces consistent validation and modification of fields.

```java
class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
```

---

### 3. Code Reusability

Validation logic is centralized, reducing redundancy.

```java
class Student {
    private String email;

    public void setEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
```

---

### 4. Security

Sensitive fields are protected from unauthorized access or accidental modification.

Encapsulation provides controlled access, ensuring only valid and safe data operations.

---

## 🧩 Summary

Apart from data hiding, encapsulation emphasizes **modularity** by packaging data and behavior within a class. Each class thus has:

- A clear responsibility
- Well-defined access control
- Enhanced code organization and readability

> **Encapsulation = Data + Methods + Access Control**
