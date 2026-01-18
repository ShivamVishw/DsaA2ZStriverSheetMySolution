import java.util.Arrays;

public class SelectionSort {

    public static int[] selctionSort(int arr[]){

        // {13,46,24,52,20,9}

        for(int i=0; i<arr.length; i++){
            int min_index = i;  // Get ith index asigned to min_index initially

            // Now compare with other element and if any element lesser than arr[i] then min_index will become that index
            for(int j= i+1; j<arr.length; j++){  // j=i+1 , because we are comparing ith elemnt with other data and after getting will be swapping with ith element.
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }            

            // Swapping 
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;   

            // Example in first pass 9 will be swapped with 13. because 9 is the smallest..
        
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(selctionSort(arr)));
    }
}
