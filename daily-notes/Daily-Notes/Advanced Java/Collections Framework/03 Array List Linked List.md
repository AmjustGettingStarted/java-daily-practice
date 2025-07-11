
# 📦 ArrayList
---

### 🧠 Key Concepts
- **Package:** `java.util`
- **Introduced in:** JDK 1.2
- **Follows:** All 4 specifications of `List` interface
- **Initial Capacity:** `10`
- **Growth Formula:** `((CurrentCapacity * 3) / 2) + 1`
- **Internal Data Structure:** Resizable Array / Growable Array

### 🤝 Interfaces Implemented
| Interface      | Purpose                                  |
|----------------|-------------------------------------------|
| List           | Ordered collection with duplicates        |
| RandomAccess   | Fast access to elements                   |
| Cloneable      | Supports cloning                          |
| Serializable   | Supports serialization                    |

### 🏗️ Constructors
- `ArrayList()`
- `ArrayList(int initialCapacity)`
- `ArrayList(Collection c)`

### 💻 Sample Program
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("ArrayList Contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

---
