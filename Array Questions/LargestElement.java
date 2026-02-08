
public class LargestElement {

    static int largestElement(int arr[]){
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }


    public static void main(String[] args) {
        int arr[] = {32,542,3,534,2,4};
        System.out.println(largestElement(arr));
    }
}
