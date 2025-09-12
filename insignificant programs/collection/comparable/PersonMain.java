
import java.util.TreeSet;

public class PersonMain {

    public static void main(String[] args) {

        TreeSet<Person> ts = new TreeSet<Person>();
        ts.add(new Person(20, "John", 20.20));
        ts.add(new Person(18, "queen", 0.001));
        ts.add(new Person(25, "Albert", 30.309));

        for (Person p : ts)
            System.out.println(p);
    }
}
