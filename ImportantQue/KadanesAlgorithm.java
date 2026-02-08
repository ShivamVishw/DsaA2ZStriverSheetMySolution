package ImportantQue;
public class KadanesAlgorithm {

    static int kadaneAlgo(int arr[]){
        int max =Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<arr.length; i++){

            // Keep adding element 
            sum += arr[i];

            // make sure max is updated
            if(sum>max){
                max = sum;
            }

            // if sum bnecomes negetive make it 0 because adding negetive will decrese max value
            if(sum<0){
                sum =0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadaneAlgo(arr));
    }
}
