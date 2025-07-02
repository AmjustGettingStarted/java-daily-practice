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
