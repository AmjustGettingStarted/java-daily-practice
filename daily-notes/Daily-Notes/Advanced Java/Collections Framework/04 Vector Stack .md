
---

## 📦 **Vector**

### 🧠 Key Concepts
- **Package:** `java.util`
- **Introduced in:** JDK 1.0
- **Implements List interface specifications**
- **Default Initial Capacity:** 10
- **Incremental Capacity:** `CurrentCapacity * 2`
- **Internal Data Structure:** Resizable / Growable Array

### 🤝 Interfaces Implemented
| Interface      | Purpose                                    |
|----------------|---------------------------------------------|
| List           | Ordered collection                         |
| RandomAccess   | Enables fast indexed access                |
| Cloneable      | Supports cloning of elements               |
| Serializable   | Allows serialization of objects            |

### 🏗️ Constructors
- `Vector()`
- `Vector(int initialCapacity)`
- `Vector(int initialCapacity, int incrementalCapacity)`
- `Vector(Collection c)`

### 💻 Sample Program
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Vector Elements:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        System.out.println("Capacity: " + languages.capacity());
    }
}
```

---

## 🧱 **Stack**

### 🧠 Key Concepts
- **Package:** `java.util`
- **Introduced in:** JDK 1.0
- **Type:** Legacy Collection Class
- **Traversal Order:** LIFO (Last In First Out)
- **Operations:**
  - `push` → Adds an object to the top
  - `pop` → Removes the top object
- **Underlying Data Structure:** Vector

### 💻 Sample Program
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack Elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // LIFO order
        }
    }
}
```



>These two classes—`Vector` and `Stack`—carry legacy charm but still have practical uses in multi-threaded and specific structural contexts. 
---