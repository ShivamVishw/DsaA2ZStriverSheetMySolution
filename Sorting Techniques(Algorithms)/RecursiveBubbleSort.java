
public class RecursiveBubbleSort {

    public static void recursiveBubbleSort(int arr[], int i){
        // Base case
        if(i==0){
            return;
        }
        for(int j = 0; j<i; j++){
            if(arr[j]>arr[j+1]){
                // Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        recursiveBubbleSort(arr, i-1); 

    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int i = arr.length;
       recursiveBubbleSort(arr,i-1);


       for (int x : arr) {
        System.out.print(x + " ");
    }
    }
}
