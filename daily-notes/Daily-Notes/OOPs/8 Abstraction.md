# ABSTRACTION

Abstraction is all about **hiding the implementation** details and **showing only the essential features** of an object. It helps in managing complexity by breaking down complex systems into smaller, more manageable parts.

> Think of it like driving a car—you know how to accelerate, brake, and steer, but you don’t need to know how the engine or ABS system works underneath. That’s abstraction.

---

## 🧵 Abstract Classes vs Interfaces

Abstraction in Java helps simplify complex systems by exposing only essential behavior while hiding implementation details. Java achieves this using two primary tools: **Abstract Classes** and **Interfaces**.

## 🧩 Abstract Classes

- Can contain:
  - **Abstract methods** (no implementation)
  - **Concrete methods** (with implementation)
- Serve as **blueprints** for other classes.
- **Cannot be instantiated** directly.
- Objects can be created from classes that **extend** these abstract classes.

## 🎯 Interfaces

- Define behavior **without implementation** (methods abstract by default).
- From Java 8+, can include:
  - **Default methods** (with implementation)
  - **Static methods**
- Focus is on **defining behavior** across unrelated classes.
- Ideal for **multiple inheritance** of type.
- Promote a clean, contract-driven architecture.

## 🔍 Key Differences

| Feature              | Abstract Class           | Interface                              |
| -------------------- | ------------------------ | -------------------------------------- |
| Method Types         | Abstract + Concrete      | Abstract (default), plus some defaults |
| Instantiation        | ❌ Not directly possible | ❌ Not directly possible               |
| Multiple Inheritance | ❌ Not supported         | ✅ Supported                           |
| Use Case             | Shared logic (is-a)      | Shared capability (can-do)             |

> 💡 Use abstract classes when you need base logic to share.  
> Use interfaces when you want to enforce behavior across different classes.

---
