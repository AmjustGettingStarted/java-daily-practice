

## 📘 **`List`**

### 📍 Overview
- `List` is a **predefined interface** in the `java.util` package.
- Introduced in **JDK 1.2** as part of the Collection Framework.
- Represents an **ordered collection** that allows **duplicate elements**.

---

### 🏗️ **Implementations of `List`**
The most commonly used classes that implement `List`:
1. `ArrayList`
2. `Vector`
3. `Stack`
4. `LinkedList`

Each provides different internal behavior for storage, efficiency, and concurrency.

---

### 🔁 **Generalization / Upcasting Example**

Using polymorphism to reference different implementations via the `List` interface:
```java
List l = new ArrayList();
List l = new Vector();
List l = new Stack();
List l = new LinkedList();
```

---

### 📋 **Key Specifications of `List` Interface**
- ✅ Maintains **insertion order**
- ✅ Allows **duplicate elements**
- ✅ **Index-based access** (starts from `0`)
- ✅ Permits **null values**

---

### 🧰 **Important Methods in `List` Interface**

| 🛠️ **Method**             | 🧾 **Purpose**                                                                 |
|---------------------------|--------------------------------------------------------------------------------|
| `get(index)`              | Retrieves the element at the specified index.                                 |
| `indexOf(object)`         | Returns the index of the **first occurrence** of an object.                   |
| `lastIndexOf(object)`     | Returns the index of the **last occurrence** of an object.                    |
| `add(index, value)`       | Inserts an object at specified index, shifts the existing one (if any).       |
| `set(index, value)`       | Overwrites the object at a specified index with a new one.                    |

---
