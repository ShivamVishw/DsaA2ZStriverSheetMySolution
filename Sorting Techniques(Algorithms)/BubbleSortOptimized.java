
import java.util.Arrays;

public class BubbleSortOptimized {
    public static int[] bubbleSortOptimized(int arr[]){
        
        for(int i=arr.length-1; i>0; i--){
            boolean didSwap = false;
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }

        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(bubbleSortOptimized(arr)));
    }
}
