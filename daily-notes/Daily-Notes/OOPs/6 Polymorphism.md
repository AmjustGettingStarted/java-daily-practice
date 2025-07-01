# 🌟 Polymorphism in Java

> _"The word ‘polymorphism’ means ‘having many forms’."_

In **Java**, polymorphism refers to the ability of a message (typically a method call) to behave differently depending on the object it is acting upon. This key concept in **Object-Oriented Programming (OOP)** allows for flexible and reusable code design.

---

## 📚 Types of Polymorphism in Java

Java supports two main types of polymorphism:

1. **Compile-time Polymorphism (Static)**
2. **Runtime Polymorphism (Dynamic)**

---

## ⚙️ 1. Compile-Time (Static) Polymorphism

This form of polymorphism is achieved through **method overloading**.

### 🔄 Method Overloading

Method overloading occurs when multiple methods have the **same name** but differ in:

- Number of parameters
- Type of parameters

This allows us to perform various operations with a single method name, enhancing code clarity and avoiding the use of redundant method names like `sum1()`, `sum2()`, etc.

### 🛠 How it Works

At **compile time**, the Java compiler determines which version of the overloaded method to invoke based on the method signature.

### 📌 Example

```java
class Sum {
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10.5, 20.5));
    }
}

Output:
30
31.0
In this example, the same method name sum() is used for different parameter combinations (two integers, three integers, or two doubles). The compiler determines the appropriate method based on the input.
```

---

## 🕒 2. Runtime (Dynamic) Polymorphism

This is achieved through **method overriding**, where a method in a **subclass** overrides the method of the **superclass** with the same name, return type, and parameters.

### 🔁 Method Overriding

Here, the **decision** of which method to invoke is made at **runtime**, based on the actual object reference.

---

### 📌 Example

```java
class Employee {
    void printDetails() {
        System.out.println("Employee details");
    }
}

class SoftwareDeveloper extends Employee {
    @Override
    void printDetails() {
        System.out.println("Software Developer details");
    }
}
```

---

## 🧠 Summary

| Feature          | Compile-Time Polymorphism                        | Runtime Polymorphism                    |
| ---------------- | ------------------------------------------------ | --------------------------------------- |
| Achieved Through | Method Overloading                               | Method Overriding                       |
| Decision Made At | Compile Time                                     | Runtime                                 |
| Method Signature | Must differ                                      | Must be same                            |
| Example          | `sum(int a, int b)` vs `sum(double a, double b)` | Overriding `printDetails()` in subclass |

---

## 🧩 Conclusion

Polymorphism enhances **flexibility**, **modularity**, and **scalability** in Java programming. Understanding how and when to use **method overloading** and **method overriding** helps in writing cleaner, more maintainable, and robust code.

> 💡 _"Polymorphism is not just a programming concept—it's a philosophy of writing code that adapts, evolves, and responds to context."_ ✨

---
