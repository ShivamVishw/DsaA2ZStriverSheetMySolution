// Sum of first N numbers

public class SumOfFirstNNaturalNumber {

    static void sumOfNNaturalNumber(int n, int sum){
        // base case
        if(n==0){
            System.out.println(sum);
            return;
        }

        // Update sum
        sum = sum+n;

        // Now call recursively until n becomes 0
        sumOfNNaturalNumber(n-1, sum);

    }

    public static void main(String[] args) {
        sumOfNNaturalNumber(6, 0);
    }
}
