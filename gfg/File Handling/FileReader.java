import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        try {
            File f = new File("car.txt");
            Scanner fr = new Scanner(f);

            while (fr.hasNextLine()) {
                String data = fr.nextLine();
                System.out.println(data);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
