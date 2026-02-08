import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

    static int[] leftRotateArray(int arr[]){
        if(arr.length==0){
            return arr;
        }
        int temp = arr[0];  // Store first index value in temporary var---- 
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp; // now every element shifted to left by one and now last index is blank so paste temp(i.e oriaginal first index value) at last index(i.e n-1)

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(leftRotateArray(arr)));
    }
}
