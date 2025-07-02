# 📘 Interface in Java

An **interface** in Java, much like abstract classes, is a mechanism to achieve **abstraction**. It allows us to define the **structure** of a class without providing the actual implementation.

Interfaces focus on **what a class should do**, rather than **how it should do it**.

In Java:
- An interface is declared using the `interface` keyword.
- Classes implement interfaces using the `implements` keyword.

Interfaces are fundamental in Java’s approach to object-oriented design, enabling:
- ✅ Multiple inheritance of method signatures
- ✅ Loose coupling between components
- ✅ Common behavior definitions across unrelated classes


```java
Eg: 
    interface Printable{
        void print();

    }
    class Myclass implements Printable{
        public void print(){
            System.out.println("Myclass");
        }
    }


    public class Test {
        public static void main(String[] args) {
            Myclass m= new Myclass();
            m.print();
        }
    }

```
---
# 📘 Features of Interfaces in Java

Interfaces in Java have several important features:

- **All members are public by default:**  
  Any method declared inside an interface is implicitly `public`.

- **Data members are `public`, `static`, and `final`:**  
  All variables in an interface are constants by default—they must be initialized immediately and cannot be changed.

- **All methods are abstract by default:**  
  Any method inside an interface is implicitly `public abstract` unless marked as `default` or `static`.

- **Default and Static methods are allowed (since Java 8):**  
  Interfaces can now contain concrete methods by using the `default` and `static` keywords.  
  - `default` methods can have a body and be overridden by implementing classes.  
  - `static` methods belong to the interface itself and are called on the interface name.

- **Multiple Interface Inheritance:**  
  A class can `implement` multiple interfaces, achieving multiple inheritance of behavior (method signatures) in Java.

- **Interface Inheritance:**  
  An interface can `extend` one or more other interfaces, allowing for interface hierarchies and reusability of contracts.

> 💡 These features make interfaces extremely powerful for designing loosely coupled, highly flexible systems in Java.

---
## 🔧 Default Behavior of Methods and Variables in a Java Interface

Understanding the default nature of members in an interface helps clarify how interfaces enforce abstraction and structure.

---

## 🔹 Methods

- All methods in an interface are **implicitly `public` and `abstract`**.
- You **do not need to explicitly write** `public abstract`—it is assumed.
- From **Java 8 onwards**, interfaces can contain:
  - `default` methods (with implementation)
  - `static` methods (with implementation)

```java
interface Example {
    void display();               // ➤ public abstract by default
    default void show() {         // ➤ default method (allowed from Java 8)
        System.out.println("Show");
    }
    static void help() {          // ➤ static method (allowed from Java 8)
        System.out.println("Help");
    }
}
```

---

## 🔹 Variables

- All variables declared in an interface are by default:
  - `public`
  - `static`
  - `final`  
- They are essentially **constants** shared across all implementations.

```java
interface Config {
    int MAX_LIMIT = 100;  // ➤ implicitly public static final
}
```

> 💡 You cannot declare instance variables inside interfaces, nor can you assign values later—they must be initialized immediately.

---

## 🔍 Summary Table

| Member Type | Default Modifier(s)         | Notes                                |
|-------------|-----------------------------|--------------------------------------|
| Method      | `public abstract`           | Unless `default` or `static`        |
| Variable    | `public static final`       | Must be initialized immediately     |

---
