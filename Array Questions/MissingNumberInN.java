public class MissingNumberInN {
    
     // Find the Missing Number
    static int missingNumber(int arr[], int n){
        // By using sum formula 
        int total = (int) n * (n+1) /2;

        int sum =0;
        for(int val : arr){
            sum +=val;
        }

        return total-sum;
    }   

    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int N = 10;
        System.out.println(missingNumber(arr, N));
    }
}
