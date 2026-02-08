package ImportantQue;
public class SecondLargest {

    static int secondLargest(int arr[]){
        if(arr.length<2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i]< largest && arr[i]>secLargest){
                secLargest = arr[i];
            }
        }

        return secLargest;
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 4, 3};
        System.out.println(secondLargest(arr));
    }
}
