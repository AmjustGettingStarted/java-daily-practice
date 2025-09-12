
import java.util.TreeSet;

public class ParentMain {
    public static void main(String[] args) {
        ParentAgeComparator pac = new ParentAgeComparator();
        TreeSet<Parent> ts = new TreeSet<Parent>(pac);
        ts.add(new Son("Jeff", 20));
        ts.add(new Daughter("Jennie", 19));
        ts.add(new Daughter("Rose", 19));
        ts.add(new Son("Baby", 20));
        ts.add(new Son("Zack", 18));

        for (Parent p : ts) {
            if (p instanceof Son s) {
                System.out.println("Son: " + s);
            } else if (p instanceof Daughter d) {
                System.out.println("Daughter " + d);
            }
        }
    }
}
