public class FirstRecursion {
    
    static void printN(String name, int count, int n){
        // Base condition
        if(count==n){
            return;
        }

        System.out.println(name);

        // Recursively call that method again n again until it reaches n.
        printN(name, count+1, n);
    }

    public static void main(String[] args) {
        printN("Shivam", 0, 6);
    }
}
