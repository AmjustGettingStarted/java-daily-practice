

## 🧪 1. Creating a File

```java
import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\File.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### ✅ Explanation:
- `File` object is created for the path `"D:\\File.txt"`.
- `createNewFile()` attempts to create the file.
- If the file exists, it notifies accordingly.
- Wrapped in a `try-catch` to handle `IOException`.

---

## 🔍 2. Getting File Information

```java
import java.io.File;

class FileInfo {
    public static void main(String[] args) {
        File obj = new File("D:\\File.txt");
        if (obj.exists()) {
            System.out.println("File Name: " + obj.getName());
            System.out.println("Absolute Path: " + obj.getAbsolutePath());
            System.out.println("Writable: " + obj.canWrite());
            System.out.println("Readable: " + obj.canRead());
            System.out.println("File Size: " + obj.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
```

### ✅ Explanation:
- Verifies existence with `exists()`.
- Gathers metadata like name, path, permissions, and file size using relevant methods.

---

