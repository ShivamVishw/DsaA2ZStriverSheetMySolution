
import java.util.Arrays;

// Reverse an array

public class ReverseArray {

    static int[] reverseArr(int arr[]){

        int i=0;
        int n = arr.length;
        while(i<n/2){       // Iterating till half of arr so that everything will get mirror until reach to middle.
            // Swapping starting and end index data
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i= i+1;  // Incrementing i continue after each step.
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {23,34,45,56,567};
        System.out.println(Arrays.toString(reverseArr(arr)));
    }
}
