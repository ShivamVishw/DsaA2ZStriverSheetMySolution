
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        // add()
        names.add("Java");
        names.add("Python");
        names.add("Java");
        System.out.println(names); // [Java, Python, Java]
        
        // get()
        System.out.println(names.get(1)); // Python
        
        // set()
        names.set(1, "C++");
        System.out.println(names); // [Java, C++, Java]
        
        // remove(index)
        names.remove(0);
        System.out.println(names); // [C++, Java]
        
        // remove(Object)
        names.remove("Java");
        System.out.println(names); // [C++]
        
        // isEmpty()
        System.out.println(names.isEmpty()); // false
        
        
        // Iteration (MOST USED)
        for(String s : names){
            System.out.println(s);
        }

    }
}



// Commonly Used Inbuilt Methods

// add()
// remove()
// get()
// set()
// size()
// contains()
// isEmpty()