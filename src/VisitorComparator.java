import java.util.Comparator;

/**
 * VisitorComparator Class
 * Used to sort Visitor objects.
 * Implements the Comparator interface to define custom sorting logic.
 */
public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First comparison: Name
        int nameComparison = v1.getName().compareTo(v2.getName());
        
        if (nameComparison != 0) {
            // If names are different, return the result immediately
            return nameComparison;
        }
        
        // Second comparison: Age (if names are the same)
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}
