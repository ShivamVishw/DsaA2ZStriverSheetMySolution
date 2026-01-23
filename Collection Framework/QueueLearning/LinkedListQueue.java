
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();


        // add()
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q); // [10, 20, 30]
    
        // offer()
        q.offer(40);
        System.out.println(q); // [10, 20, 30, 40]
    
        // peek()
        System.out.println(q.peek()); // 10
    
        // element()
        System.out.println(q.element()); // 10
    
        // poll()
        System.out.println(q.poll()); // 10
        System.out.println(q); // [20, 30, 40]
    
        // remove()
        System.out.println(q.remove()); // 20
        System.out.println(q); // [30, 40]

    }
}
