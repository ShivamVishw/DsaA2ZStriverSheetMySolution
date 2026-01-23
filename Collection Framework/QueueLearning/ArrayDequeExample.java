
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // addFirst() addLast()
        dq.addFirst(30);
        dq.addFirst(10);
        dq.addLast(20);
        dq.add(50);
        System.out.println(dq);

        // removeFirst() removeLast()
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        // peekFirst() peekLast()
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.peek());
    }
}
