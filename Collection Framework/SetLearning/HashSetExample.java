
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        // add()
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); 
        System.out.println(hs);
        
        // remove()
        hs.remove(20);
        System.out.println(hs);
        
        // contains()
        System.out.println(hs.contains(10)); // true
        
        // size()
        System.out.println(hs.size());
        
        
        // Iteration (MOST COMMON)
        for(Integer i : hs){
            System.out.println(i);
        }

    }
}


// add()
// remove()
// contains()
// size()
// isEmpty()
// clear()
// iterator()
