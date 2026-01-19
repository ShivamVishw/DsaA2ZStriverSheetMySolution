
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate
        System.out.println(set); // [10, 20]
    }
}


// Common Set Methods (IMPORTANT)

// add()
// remove()
// contains()
// size()
// isEmpty()
// clear()
// iterator()