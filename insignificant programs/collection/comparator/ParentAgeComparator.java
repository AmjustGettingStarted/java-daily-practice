
import java.util.Comparator;

public class ParentAgeComparator implements Comparator<Parent> {
    @Override
    public int compare(Parent x, Parent y) {
        return x.name.compareTo(y.name);
    }
}
