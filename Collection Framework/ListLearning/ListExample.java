
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // [10, 20, 30]
        
        // add(index, element)
        list.add(1, 15);
        System.out.println(list); // [10, 15, 20, 30]
        // get(index)
        System.out.println(list.get(2)); // 20
        
        
        // set(index, element)
        list.set(2, 25);
        System.out.println(list); // [10, 15, 25, 30]
        
        // remove(index)
        list.remove(1);
        System.out.println(list); // [10, 25, 30]
        
        // remove(Object)
        list.remove(Integer.valueOf(25));
        System.out.println(list); // [10, 30]
        
        // size()
        System.out.println(list.size()); // 2
        
        // contains()
        System.out.println(list.contains(10)); // true
        
        
        // indexOf() & lastIndexOf()
        list.add(10);
        System.out.println(list.indexOf(10)); // 0
        System.out.println(list.lastIndexOf(10)); // 2
        
        // clear()
        list.clear();
        System.out.println(list); // []

    }
}




// Common List Methods (Very Important)

// add()
// add(index, element)
// get(index)
// set(index, element)
// remove(index)
// remove(Object)
// size()
// contains()
// indexOf()
// lastIndexOf()
// clear()