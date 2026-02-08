public class MaximumSubarraySum {

    static int maxSubarraySumByKadanesAlgo(int arr[]){

        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0; i<arr.length; i++){
            // Keep adding
            sum += arr[i];

            // Make sure max is updated with max sum ssubarray
            if(sum>max){
                max= sum;
            }

            // if sum becomes negetive make sum to 0 because negetive value will always decrese the sum which does not make any sense.
            if(sum<0){
                sum =0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySumByKadanesAlgo(arr));
    }
}

// Kadanes algorithms