
import java.util.LinkedList;


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        // add()
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
       
        // addFirst() / addLast()
        ll.addFirst(5);
        ll.addLast(40);
        System.out.println(ll); // [5, 10, 20, 30, 40]
        
        // getFirst() / getLast()
        System.out.println(ll.getFirst()); // 5
        System.out.println(ll.getLast()); // 40
        
        // removeFirst() / removeLast()
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); // [10, 20, 30]
        
        // remove()
        ll.remove(Integer.valueOf(20));
        System.out.println(ll); // [10, 30]

    }
}


// Special LinkedList Methods

// addFirst()
// addLast()
// removeFirst()
// removeLast()
// getFirst()
// getLast()