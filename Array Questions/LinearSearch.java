public class LinearSearch {
    static int linearSearch(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {23,4,-34,56,768,353};
        int k = -34;
        System.out.println(linearSearch(arr, k));
    }
}
