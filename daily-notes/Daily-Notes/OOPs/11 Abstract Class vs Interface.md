# 🎯 Abstract Class vs Interface in Java

In Java, **abstraction** is used to hide the complexity of a program and only expose its **essential parts**. Both **abstract classes** and **interfaces** support abstraction, but they serve different design needs and follow distinct rules.

---

## ✅ Similarities

- Both abstract classes and interfaces are used to achieve **abstraction**.
- You **cannot create instances** of either an abstract class or an interface.
- You **can create references** to both abstract classes and interfaces.

---

## 🔍 Comparison Table

| 🔑 Feature                      | 🧩 Abstract Class                                         | 🎯 Interface                                               |
|-------------------------------|----------------------------------------------------------|-----------------------------------------------------------|
| **Constructors**               | Can have constructors                                    | ❌ Cannot have constructors                               |
| **Data Members**               | Can have non-static, non-final data members              | All data members are `public static final` (constants)    |
| **Methods**                    | Can have any access modifier (`public`, `private`, etc.) | All methods are `public` by default                       |
| **Inheritance**               | A class can extend **only one** abstract class            | A class can implement **multiple** interfaces              |
| **Multiple Inheritance**       | ❌ Not supported (no multiple class inheritance)          | ✅ Supported (interface can extend multiple interfaces)     |
| **Implementation**             | Can implement interfaces and extend other classes        | Can only extend other interfaces                          |
| **Access Modifiers (Methods)** | Can use `private`, `protected`, `default`, and `public`  | Only `public` methods are allowed by default              |
| **Non-abstract Methods**       | Can contain regular (non-abstract) methods               | Can have `default` and `static` methods (Java 8+)         |

---

> 📌 Use **abstract classes** when you need shared logic and state.  
> Use **interfaces** when you need a pure abstraction or multiple inheritance.

