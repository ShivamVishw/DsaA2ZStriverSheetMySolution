// Fibonacci Number

public class FibonacciSeries {

    static void fibnacciSeries(int n, int a, int b){
        // Base case
        if(n==0){
            return;
        }

        // calculate next element and print
        int c= a+b;
        System.out.println("Element: "+ c);

        // call recursively by decrementing n by 1 and update a and b value by b and c respectively.
        fibnacciSeries(n-1, b, c);
    }

    public static void main(String[] args) {
        fibnacciSeries(8, 0, 1);
    }
}
