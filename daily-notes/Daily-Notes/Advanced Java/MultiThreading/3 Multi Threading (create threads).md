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
