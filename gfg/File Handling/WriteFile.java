import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("car.txt");
            fw.write("Hello World!!!");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
