

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

## 🛠️ Essential Methods in `File` Class

| Method Name         | Description                                                                 |
|----------------------|------------------------------------------------------------------------------|
| `mkdir()`            | Creates a new directory.                                                     |
| `createNewFile()`    | Creates a new file with the specified extension.                            |
| `exists()`           | Checks if the file or directory exists.                                     |
| `delete()`           | Deletes the specified file or directory.                                    |
| `renameTo(File dest)`| Renames the current file/directory to the specified one.                    |
| `lastModified()`     | Returns the last modified time of file (in milliseconds since epoch).       |

---

## 📚 Stream Types

### 🔤 Character Streams
Used for handling **textual data**. Automatically manages character encoding.

- **Classes**: `FileReader`, `FileWriter`
- Best suited for `.txt`, `.csv`, `.xml`, etc.

### 🔢 Byte Streams
Used for handling **binary data** such as images, audio, and video.

- **Classes**: `FileInputStream`, `FileOutputStream`
- Ideal when character encoding is not required.

---

## 💡 Additional Notes
- Always close streams (`close()`) to prevent memory leaks.
- Wrap file operations inside try-catch blocks to handle `IOExceptions`.
- Serialized objects must implement the `Serializable` interface when using `ObjectOutputStream`.

---
