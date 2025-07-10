

# 📂 `File Handling` 

File handling refers to the process of **reading from** and **writing to** files in Java, enabling persistent storage of data.

---

## 🧱 Storage Platforms
Java provides two main platforms for data persistence:
- **Files** → via the `java.io` package.
- **Databases** → via `JDBC` or `Hibernate`.

---

## 🧰 Key Classes in `java.io`

| Class Name           | Purpose                                                                 |
|----------------------|-------------------------------------------------------------------------|
| `File`               | Represents a file or directory path.                                    |
| `FileReader`         | Reads data from a file (character-based).                               |
| `FileWriter`         | Writes data to a file (character-based).                                |
| `FileInputStream`    | Reads raw byte data from a file (useful for images, videos, etc.).      |
| `FileOutputStream`   | Writes raw byte data to a file.                                         |
| `ObjectInputStream`  | Reads serialized object data from a file.                               |
| `ObjectOutputStream` | Writes serialized object data to a file.                                |

---

