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



> 📌 Use **abstract classes** when you need shared logic and state.  
> Use **interfaces** when you need a pure abstraction or multiple inheritance.

---
# 🧠 When to Use Abstract Classes vs Interfaces in Java

In Java, both abstract classes and interfaces support **abstraction**, but they shine in different design scenarios. Here's a detailed guide to help you decide when to use each:

---

## 1️⃣ When to Use **Abstract Classes**

Use an abstract class when:

- ✅ **There is a logical “is-a” relationship** between the base class and its subclasses.  
  _Example:_ `Shape` and `Rectangle`, or `Employee` and `SalesEmployee`.

- 🔐 **You need to define non-public methods** such as `protected`, `private`, or `default` methods inside the base class, which is **not allowed in interfaces**.

- 🧩 **You require instance variables** (non-static, non-final fields), such as a shared `salary` or `color` that varies between instances.

- 🧰 You want to provide **partial implementations** to be reused in multiple subclasses using **concrete methods**.

- 📦 You wish to provide a **base constructor** to initialize fields via `super()` call in derived classes.

---

## 2️⃣ When to Use **Interfaces**

Use an interface when:

- 🔄 You want to **define a contract** that can be shared across **unrelated classes**.  
  _Example:_ `Comparable` can be implemented by `Student`, `Employee`, `Invoice`, etc.

- 🧪 You need **multiple implementations** for the same behavior.  
  _Example:_ Two classes implementing `Printable`, each defining their own `print()` logic.

- 🧬 You want **multiple inheritance of type**:
  - A class can **implement multiple interfaces**.
  - An interface can **extend multiple other interfaces**.

- ⚖️ You want to use `default` and `static` methods (introduced in Java 8+) for sharing utility methods across implementers.

---

> 🎯 **Pro Tip:**  
> Use **abstract classes** when you're building a strong inheritance tree with shared behavior and partial logic.  
> Use **interfaces** when you're specifying capabilities like “can fly,” “can serialize,” or “can compare”—especially across unrelated types.
