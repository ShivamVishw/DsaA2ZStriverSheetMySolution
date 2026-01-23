
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        // add()
        q.add(30);
        q.add(10);
        q.add(20);
        System.out.println(q);

        // poll()
        q.poll(); // 10
        System.out.println(q);

        // peek()
        System.out.println(q.peek());


        // Custom priority (Comparator)
        Queue<Integer> pq = new PriorityQueue<>(
            (a, b) -> b-a // max heap
        );

        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println(pq);
        

    }
}
