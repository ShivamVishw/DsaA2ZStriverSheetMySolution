public class RemoveDuplicatesAndReturnTotalUnique {

    static int removeDuplicateElement(int arr[]){
        // base case
        if (arr.length == 0) return 0;

        int index =1;  // initially it will be at 1st pos because 0th position element is already on correct position which means currently length of array is considered 1;

        for(int i=1; i<arr.length ; i++){
            if(arr[i]>arr[i-1]){
                arr[index] = arr[i];
                index++;  // increment index where next unique element will be stored
            }
        }
        // index shows number of unique elements
        return index;
    }

    public static void main(String[] args) {
          int arr[] = {1,1,1,2,2,3,3,3,3,4,4};
          System.out.println(removeDuplicateElement(arr));
    }
}
