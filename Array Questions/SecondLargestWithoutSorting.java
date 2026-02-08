public class SecondLargestWithoutSorting {
    static int largestElement(int arr[]){
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    static int secLargest(int arr[]){
        int seclargest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>seclargest && arr[i]!= largestElement(arr)){
                seclargest = arr[i];
            }
        }

        return seclargest;
    }

    public static void main(String[] args) {
        int arr[] = {34,35,53,34,2,536,42,23,536,53};
        System.out.println(secLargest(arr));
    }
}
