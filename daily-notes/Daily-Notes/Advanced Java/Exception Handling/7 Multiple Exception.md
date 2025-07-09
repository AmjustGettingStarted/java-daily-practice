# 🎯 Multiple Exceptions 

When a program executes, multiple things can go wrong files may go missing, arithmetic can fail, inputs can be invalid. Java allows you to handle **several types of exceptions** in a single code block using smart structures.

---

### 🔧 Declaring Multiple Exceptions

When a method may throw more than one exception:
- Use `throws` in the method declaration to list all potential **checked exceptions**.
- You don't need to declare **unchecked exceptions** like `NullPointerException`.

```java
public void processData() throws IOException, SQLException{
    // Function definition
}
```

---

### 🧰 Handling with Multiple `catch` Blocks

Use separate `catch` blocks to respond to different exceptions:
- Always list **more specific exceptions first**, then more general ones like `Exception`.
- This prevents unreachable code errors.

```java
try {
    // code that might throw exceptions
} catch (FileNotFoundException e) {
    // specific
} catch (Exception e) {
    // general
}
```

---

### 🎁 Optional `finally` Block

Use `finally` for clean-up operations (closing files, releasing resources). It runs **no matter what**—whether an exception was thrown or caught.

```java
finally {
    // cleanup code
}
```

---