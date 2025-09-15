package List.Map;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpIterator {
    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<>();
        al.add(new Emp(22, "Klein"));
        al.add(new Emp(23, "Melisa"));
        al.add(new Emp(28, "Benson"));
        al.add(new Emp(500, "The FooL"));

        Iterator<Emp> i = al.iterator();
        while (i.hasNext()) {

            Emp e = i.next();
            System.out.println(e.name + e.age);
        }
    }
}
