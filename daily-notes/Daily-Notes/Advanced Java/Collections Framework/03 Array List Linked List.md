
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

## 🔗 LinkedList

### 🧠 Key Concepts
- **Package:** `java.util`
- **Introduced in:** JDK 1.2
- **Node Structure:** Each node stores the object, previous node’s address, and next node’s address
- **No Initial/Incremental Capacity**
- **Internal Data Structure:** Doubly Linked List

### 🤝 Interfaces Implemented
| Interface      | Purpose                                  |
|----------------|-------------------------------------------|
| List           | Maintains insertion order                 |
| Deque          | Supports operations at both ends          |
| Cloneable      | Enables cloning                           |
| Serializable   | Enables serialization                     |

### 🏗️ Constructors
- `LinkedList()`
- `LinkedList(Collection c)`

### 💻 Sample Program
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("LinkedList Contents:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
```

---

## ⚔️ Difference Between ArrayList & LinkedList

| Feature                    | ArrayList                         | LinkedList                            |
|---------------------------|-----------------------------------|----------------------------------------|
| **Structure**             | Resizable Array                   | Doubly Linked List                     |
| **Access Time**           | Fast (via index)                  | Slow (traverse nodes)                  |
| **Insertion/Deletion**    | Slower (shifting elements)        | Faster (node manipulation)             |
| **Memory Overhead**       | Less                              | More (extra node links)                |
| **Initial Capacity**      | 10 (default)                      | Not applicable                         |
| **Interfaces Added**      | RandomAccess                      | Deque                                  |



---

## 🎯 **Conclusion**

Choosing between **ArrayList** and **LinkedList** depends entirely on your use case:

| Operation Type                  | Recommended Collection | Reason                                      |
|--------------------------------|-------------------------|---------------------------------------------|
| **Inserting & Deleting in between**<br>(Manipulation Involved) | 🔗 **LinkedList**         | Faster manipulation due to node structure   |
| **Storing & Retrieving objects**<br>(No Manipulation Involved)   | 📦 **ArrayList**          | Quicker access with index-based retrieval   |

>In essence, if your application involves **frequent changes to the list’s contents** especially in the middle go with `LinkedList`. If you need **fast access and fewer changes**, `ArrayList` is your best bet.

---

