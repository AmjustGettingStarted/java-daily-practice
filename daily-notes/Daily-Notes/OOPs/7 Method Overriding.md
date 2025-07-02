# What is Method Overriding?

Method overriding occurs when a subclass (or derived class) has a method with the same name, same parameters, and same return type as a method in its superclass (base class). This enables the subclass to provide its own specific implementation of that method, even though the method was initially defined in the superclass.

For instance, if a base class has a method fun(), the derived class can override that method and provide a different implementation for it. The most important feature of method overriding is that the call to the method is resolved at runtime (hence, it is also called "runtime polymorphism").

---

## Why is Method Overriding Useful?

Method overriding allows the creation of flexible and reusable code. For example, you can write a method in the base class that performs some general functionality, but in the derived class, you can override that method to provide a more specific behavior.

In real-world applications, such as in employee management systems, method overriding makes it easier to handle multiple types of employees (e.g., SalesEmployee, HRManager, Developer) without writing separate functions for each type. This improves code readability and maintainability.

```java

class Base {
    void fun() {
        System.out.println("Base's fun");
    }
}

class Derived extends Base {
    @Override
    void fun() {
        System.out.println("Derived's fun");
    }
}

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}

Output:

Derived's fun

```

---

# Benefits of Method Overriding

- **Flexibility:**  
  It allows the same method name to have different behaviors depending on the object that calls it.

- **Simplified Code:**  
  Instead of writing separate methods for each type of object, you can override the same method in different subclasses and maintain cleaner code.

- **Polymorphism:**  
  It is a fundamental feature of polymorphism, where the method call is resolved at runtime based on the object type, not the reference type.

---

# Real-World Example of Method Overriding

Consider a situation where you have an `Employee` class, and you create different subclasses like `HRManager`, `SalesEmployee`, and `SoftwareDeveloper`. All these subclasses might need a `raiseSalary()` method but with different implementations based on their roles.

With method overriding, you can define the `raiseSalary()` method in the `Employee` class and override it in the derived classes to suit their specific needs. When you call the method, Java will call the appropriate overridden method based on the actual object type.

---

# Advantages of Method Overriding

- **Code Reusability:**  
  You don't need to write separate functions for each subclass, making your code more reusable.

- **Easy Maintenance:**  
  Since the method behavior is defined in the subclass, you can modify it without affecting other parts of the program.

- **Polymorphic Behavior:**  
  You can handle different types of employees using a single method call, improving the flexibility of the program.
