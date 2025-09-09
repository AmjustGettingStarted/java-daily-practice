import java.util.ArrayList;

public class ArrayList1

{
    public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<>();
        l.add(10);
        l.add("hello world");
        l.add('c');

        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println("Using Loop");
        for (int i = 0; i < l.size(); i++) {
            System.out.print("-> " + l.get(i) + "\n");

        }
        System.out.println("Using For Each Loop");
        for (Object o : l)
            System.out.println("=> " + o);
    }
}
