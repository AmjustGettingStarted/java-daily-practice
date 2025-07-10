import java.io.File;

class Demo{
    public static void main(String[] args) {
        File f = new File("car.txt");
        // System.out.println(f.mkdir());  // Just Creates a Directory
        try{
        boolean res = f.createNewFile();
        System.out.println("File Created: " + res);
        }
        catch(Exception e){
            System.out.println("Exception Occurred: " + e);
        }
    }
}