
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        //  push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // [10, 20, 30]
    
        // pop()
        System.out.println(stack.pop()); // 30
        System.out.println(stack); // [10, 20]
    
        // peek()
        System.out.println(stack.peek()); // 20
    
        // empty()
        System.out.println(stack.empty()); // false
    
        // search()
        System.out.println(stack.search(10)); // 2 (1-based index)
    }
}


// Stack Methods (VERY IMPORTANT)

// push()
// pop()
// peek()
// empty()
// search()