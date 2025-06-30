# Access Modifiers in Java

In Java, **access modifiers** help to restrict the scope of a class, constructor, variable, method, or data member. They provide **security, encapsulation, and controlled accessibility** to users depending on the access modifier used with the element.

Java has four primary access modifiers:

- `private`
- `default` (no modifier specified)
- `protected`
- `public`

![Access Modifiers Chart](https://media.geeksforgeeks.org/wp-content/uploads/20250125155843333777/AM-in-java.jpg)

Each modifier defines a specific scope for accessing class members. Let’s dive into each of them with examples.

---

## 🛑 Private

The `private` access modifier is the **most restrictive**. It allows members to be accessed **only within the same class** in which they are defined.

- **Usage**: Good for encapsulation and hiding internal logic or data.
- **Example**:

  ```java
  class Example {
      private int data = 10;

      private void showData() {
          System.out.println(data);
      }
  }
  ```

⛔ This `data` field and `showData()` method can't be accessed from any other class.

---

## 📦 Default (Package-Private)

When **no access modifier** is specified, Java assigns the default, also known as **package-private** access.

- **Scope**: Accessible **only within the same package**.
- **Example**:

  ```java
  class Example {
      int data = 10;

      void showData() {
          System.out.println(data);
      }
  }
  ```

✅ The `data` and `showData()` are accessible to other classes in the same package, but **not outside the package**.

---

## 🛡️ Protected

The `protected` modifier allows access:

- Within the **same package**, and
- From **subclasses in different packages** (through inheritance).

- **Example**:

  ```java
  class Parent {
      protected int number = 100;

      protected void display() {
          System.out.println("Number: " + number);
      }
  }

  class Child extends Parent {
      void access() {
          display();
      }
  }
  ```

✅ `Child` can access `number` and `display()` because it's a subclass.

---

## 🌍 Public

The `public` modifier is the **least restrictive**. It allows members to be accessed from **anywhere** in the program, across packages.

- **Example**:

  ```java
  public class Example {
      public int data = 100;

      public void showData() {
          System.out.println(data);
      }
  }
  ```

✅ Any class, in any package, can access `data` and `showData()`.

---

![Access Modifiers Table](https://media.geeksforgeeks.org/wp-content/uploads/20250125164613530128/Access-Modifiers-in-Java.png)

---

## 🔑 Key Points to Remember

- **Encapsulation**: Always use the **most restrictive** access modifier that fits your use case. Prefer `private` unless wider access is explicitly needed.
- **Default Modifier**: If no modifier is used, the member is **accessible only within the same package**.
- **Inheritance with Protected**: `protected` allows access in **subclasses**, even if they're in a **different package**.
- **Public Classes and Members**: Use `public` when the method or class needs to be accessed **universally**.
- **Nested Classes**: Access modifiers also apply to **nested (inner) classes** and help control their visibility.

---
