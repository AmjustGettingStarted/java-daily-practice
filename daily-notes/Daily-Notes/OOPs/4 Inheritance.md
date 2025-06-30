# Inheritance

---

Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.

## Why Is Java Inheritance Important?

- Implements is-a relationship: It represents a hierarchical relationship between classes. For example, a SalesEmp is-a Employee.
- Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.
- Polymorphism via Method Overriding: Inheritance enables runtime polymorphism, where subclasses can override methods from the superclass to provide specific behavior.
- Abstract Classes and Interfaces: Inheritance facilitates abstraction. Using abstract classes and interfaces, you can define behavior in a superclass without specifying the implementation, leaving it to the subclasses.

## Terminologies Used in Java Inheritance

- Class: Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
- Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
- Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
- Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

# Inheritance Hierarchy in Java

In Java, the Object class is the root of all classes. Even if a class doesn’t explicitly extend another class, it implicitly extends Object. The Object class provides fundamental methods that are inherited by all classes.

1. clone():

Creates a copy of the current object.  
Useful for duplicating objects while maintaining their state.

2. equals():

Compares two objects for equality.  
By default, it compares memory addresses, but it can be overridden to compare object content.

3. hashCode():

Returns a unique integer representing the object.  
Typically used in collections like HashMap and HashSet for efficient lookup.

4. toString():

Returns a string representation of the object.  
By default, it includes the class name and memory address, but it can be overridden for meaningful output.

Inheritance in Java is a powerful tool that enhances code maintainability and structure, enabling developers to model real-world hierarchies efficiently.

# Types of Inheritance

![Img](https://studywholenight.com/wp-content/uploads/2023/03/image-1024x546.png)

1. Single Inheritance  
   When a class extends another one class only then we call it a single inheritance. The below flow diagram shows that class B extends only one class which is A. Here A is a parent class of B and B would be a child class of A.

Single Inheritance example program in Java

```java
class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class B extends A
{
   public void methodB()
   {
     System.out.println("Child class method");
   }

   public static void main(String args[])
   {
     B obj = new B();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
   }
}
```

2. Multiple Inheritance
   “Multiple Inheritance” refers to the concept of one class extending (Or inherits) more than one base class. The inheritance we learnt earlier had the concept of one base class or parent. The problem with “multiple inheritance” is that the derived class will have to manage the dependency on two base classes.

Note 1: Multiple Inheritance is very rarely used in software projects. Using Multiple inheritance often leads to problems in the hierarchy. This results in unwanted complexity when further extending the class.

Note 2: Most of the new OO languages like Small Talk, Java, C# do not support Multiple inheritance. Multiple Inheritance is supported in C++.

3. Multilevel Inheritance
   Multilevel inheritance refers to a mechanism in OO technology where one can inherit from a derived class, thereby making this derived class the base class for the new class. As you can see in below flow diagram C is subclass or child class of B and B is a child class of A. For more details and example refer – Multilevel inheritance in Java.

```
Class X
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}
Class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
Class Z extends Y
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}
```

4. Hierarchical Inheritance
   In such kind of inheritance one class is inherited by many sub classes. In below example class B,C and D inherits the same class A. A is parent class (or base class) of B,C & D. Read More at – Hierarchical Inheritance in java with example program.

```
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // inherited from Animal
        dog.bark();   // Dog's own method

        Cat cat = new Cat();
        cat.sound();  // inherited from Animal
        cat.meow();   // Cat's own method
    }
}

Output:
Animal makes a sound
Dog barks
Animal makes a sound
Cat meows

```

5. Hybrid Inheritance
   In simple terms you can say that Hybrid inheritance is a combination of Single and Multiple inheritance. A typical flow diagram would look like below. A hybrid inheritance can be achieved in the java in a same way as multiple inheritance can be!! Using interfaces. yes you heard it right. By using interfaces you can have multiple as well as hybrid inheritance in Java.

```
// Interface 1
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Base class
class Document {
    void open() {
        System.out.println("Document opened");
    }
}

// Derived class that extends a class and implements multiple interfaces
class Report extends Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing report...");
    }

    public void show() {
        System.out.println("Showing report...");
    }
}

// Main class
public class HybridExample {
    public static void main(String[] args) {
        Report report = new Report();
        report.open();   // From base class
        report.print();  // From Printable interface
        report.show();   // From Showable interface
    }
}

```

## How to Achieve Multiple Inheritance in java using Interface ?

```
// First interface with an abstract method
interface Printable {
    void print();  // implicitly public and abstract
}

// Second interface with an abstract method
interface Showable {
    void show();   // implicitly public and abstract
}

// Class that implements both interfaces (achieving multiple inheritance of behavior)
class Document implements Printable, Showable {

    // Overriding the print() method from Printable interface
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    // Overriding the show() method from Showable interface
    @Override
    public void show() {
        System.out.println("Showing document...");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of the class that implements both interfaces
        Document doc = new Document();

        // Calling the overridden methods
        doc.print();  // Output: Printing document...
        doc.show();   // Output: Showing document...
    }
}

Output:
Printing document...
Showing document...
```
