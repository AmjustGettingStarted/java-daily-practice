# 📘 Abstract Classes

An **abstract class** in Java is a class that **cannot be instantiated** directly. It serves as a **blueprint** for other classes and is used to achieve **abstraction**—hiding internal details while exposing essential behavior.

---

## 🔹 Key Features

- Declared using the `abstract` keyword.
- Can include:
  - **Abstract methods** (without a body)
  - **Concrete methods** (with implementation)
- Can have **constructors**, **fields**, and **static methods**.
- Subclasses must implement all abstract methods unless they are also declared abstract.

---

## 📎 Syntax

```java
eg1:
abstract class Vehicle {
    abstract void start();      // Abstract method
    void fuel() {               // Concrete method
        System.out.println("Refueling...");
    }
    void getPrice();            // Abstract Method
}

eg2:
abstract class Shape {
    String color;

    // Non-abstract method
    void getColor() {
        System.out.println("Color: " + color);
    }

    // Abstract method (does not have a body)
    abstract double getArea();
}
```

---

# 🚫 Why Can't We Instantiate an Abstract Class in Java?

An **abstract class** is a conceptual base—it’s incomplete by design. Its purpose is to provide a **common structure and contract** for its subclasses, not to be used on its own.

---

## ❓ Key Reasons

### 1. 🔧 Abstract Methods Are Incomplete

- Abstract classes often contain **abstract methods**—methods with no implementation.
- Instantiating such a class would mean calling methods that don’t have any code to execute, which would cause runtime errors.

### 2. 🚫 Logical Design Restriction

- Abstract classes are meant to be **extended**, not directly used.
- They represent **generic behavior** that's supposed to be specialized by subclasses.

### 3. 💬 Java Enforces It

- Java’s compiler enforces this design pattern:

  ```java
  abstract class Animal {
      abstract void makeSound();
  }

  Animal a = new Animal(); // ❌ Compile-time error
  Animal a = new Dog(); // ✅ Allowed if Dog extends Animal and implements makeSound()
  ```

---

## Inheriting Abstract Class

You have to follow the rules of Abstraction

When a class extends an abstract class, it must **either**:

1. **Implement all abstract methods** declared in the abstract superclass  
   **OR**
2. Be declared as an **abstract class itself**

---

### ✅ Why This Rule Exists

- Abstract classes define a **contract** (set of behaviors) that subclasses are expected to fulfill.
- If a subclass doesn't implement all abstract methods, it would be **incomplete**, so Java requires it to be abstract too.

---

### 🔍 Example

```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}
```

---

## 📘 Key Points About Abstract Classes in Java

Java's **abstract classes** are essential for achieving abstraction, enabling designers to define incomplete blueprints for subclasses to complete. Below are the most important points to remember:

---

## 1. 🚫 Cannot Create Instances

- You **cannot instantiate** an abstract class directly.
- Example:
  ```java
  Shape s = new Shape(); // ❌ Error: Shape is abstract
  ```

---

## 2. 🔁 Can Have References

- Abstract classes can still be used as **reference types**.
- These references can point to instances of their concrete subclasses.
  ```java
  Shape s = new Square("Red", 10.0); // ✅ Valid, since Square extends Shape
  ```

---

## 3. 🏗 Can Have Constructors

- Despite being abstract, they **can have constructors**.
- These constructors can be called via `super()` when a subclass is created.

---

## 4. ❌ No Need for Abstract Methods

- An abstract class **does not require** any abstract methods.
- It can be fully concrete and still abstract—just to **prevent instantiation**.

---

## 5. ✅ Subclasses Must Implement Abstract Methods

- If the abstract class declares **at least one abstract method**, the subclass must:
  - Implement it **OR**
  - Be declared `abstract` itself.

---

## 6. 🧠 Logical Grouping of Subclasses

- Useful for **organizing related subclasses** with common behavior.
- Example:  
  An abstract class `Employee` with shared methods like `raiseSalary()` or `changeDepartment()` can be extended by `Manager`, `Developer`, etc.

---

## 7. ⚙️ Can Have Static Methods

- Abstract classes **can include static methods**, which are:
  - Not tied to any instance
  - Shared across all subclasses

---

## 8. 📌 Abstract Classes Without Abstract Methods

- A class can be abstract even without abstract methods.
- This is helpful when:
  - You want to **prevent direct instantiation**
  - You don’t need to define abstract behavior but still want to control instantiation

---

> 🧵 Use abstract classes for shared base logic, type-safe hierarchy enforcement, and controlled extensibility in OOP systems.
---
## Example of Abstract Class
```java
    abstract class Shape {
        int color;

        int getColor() {
            return color;
        }

        Shape(int c) {
            color = c;
        }

        abstract double getArea();
    }

    class Square extends Shape {
        double side;

        Square(int c, double s) { 
        super(c); 
        side = s; 
        }

        @Override
        double getArea() {
            return side * side;
        }
    }

    public class Test{

        public static void main(String[] args) {
            Shape s = new Square(5, 10.0);
            System.out.println(s.getArea());
        }
    }

Output: 
100.0
```
## 🧾 Explanation of the Code

1. **Abstract Class `Shape`**
   - Contains the abstract method `getArea()`, which must be implemented by subclasses.
   - Has a concrete method `getColor()` to return the color of the shape.
   - Includes a constructor to initialize the `color` field.

2. **Subclass `Square`**
   - Extends the abstract class `Shape` and implements the `getArea()` method.
   - The constructor calls the parent class constructor to set the `color` and initializes its own `side` field.
   - The `getArea()` method calculates the square's area as `side * side`.

3. **Main Class**
   - Creates an instance of the `Square` class with color `"Red"` and side length `10.0`.
   - The `getArea()` method is called, returning the area: `100.0`.

---