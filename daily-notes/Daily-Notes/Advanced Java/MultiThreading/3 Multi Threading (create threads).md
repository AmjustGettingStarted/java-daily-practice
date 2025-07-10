## Java provides two primary ways to create and manage threads:

- By extending the Thread class.
- By implementing the Runnable interface.

---

## 🌟 1. Creating a Thread by Extending the `Thread` Class

This approach involves **inheriting from `Thread`** and overriding the `run()` method where your thread logic goes.

### ✅ Example

```java
// ✅ Step 1: Define your thread by extending Thread
class MyThread extends Thread {
    @Override
    public void run() {
        // Thread logic goes here
        System.out.println("Running in MyThread!");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        // ✅ Step 2: Create an object of your thread class
        MyThread t1 = new MyThread();

        // ✅ Step 3: Start the thread (calls run() internally)
        t1.start();

        System.out.println("Main thread running!");
    }
}
```

### 📌 Notes

- Use `start()` to execute in a separate thread.
- Directly calling `run()` runs the code on the main thread—no parallelism.
- ⚠️ Limitation: If you extend `Thread`, you **can't extend any other class** (Java doesn't support multiple inheritance).

---

## 💡 2. Creating a Thread by Implementing the `Runnable` Interface

This is a more flexible approach—your class can still extend other classes while implementing `Runnable`.

### ✅ Example

```java
// ✅ Step 1: Create a Runnable class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Thread logic goes here
        System.out.println("Running in MyRunnable!");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        // ✅ Step 2: Create a Runnable object
        MyRunnable myRunnable = new MyRunnable();

        // ✅ Step 3: Pass Runnable to Thread constructor
        Thread t2 = new Thread(myRunnable);

        // ✅ Step 4: Start the thread
        t2.start();

        System.out.println("Main thread running!");
    }
}
```

### 📌 Notes

- This approach encourages **separation of concerns**—logic (`Runnable`) vs threading (`Thread`).
- Ideal for **thread pooling** and frameworks where thread creation is managed externally.

---

## 🆚 Comparison Table

| Feature             | Extending `Thread`          | Implementing `Runnable`     |
| ------------------- | --------------------------- | --------------------------- |
| Inheritance Limit   | 🚫 Can't extend other class | ✅ Can extend another class |
| Flexibility         | Less flexible               | More flexible               |
| Separation of Logic | Thread & logic combined     | Logic separated from Thread |
| Recommended For     | Simple programs             | Scalable & modular code     |

---
