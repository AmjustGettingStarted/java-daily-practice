package insignificant

import java.util.ArrayList;

programs.collection.iterator;

public class Iterator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(50);

        java.util.Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
