import java.util.Arrays;

public class RearragePosNegAlternateInArray {

    public int[] rearrangeArray(int[] arr) {
        int pos[] = new int[arr.length/2];
        int neg[] = new int[arr.length/2];
        int j=0; 
        int k=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]<0){
                neg[j] = arr[i];
                j++;
            }else{
                pos[k] = arr[i];
                k++;
            }
        }

        for(int i=0; i<arr.length/2; i++){
            arr[2*i] = pos[i]; // positive indexs

            arr[2*i + 1] = neg[i]; /// negetive indexes

        }

        return arr;
    }



    // Optimal solution
    static int[] rearragePosNegAlternateInArray(int arr[]){
        
        int posIndex =0; // Track of positive next index
        int negIndex =1; // Track of negetive next index

        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                temp[posIndex] = arr[i];
                posIndex+=2;
            }else{
                temp[negIndex] = arr[i];
                negIndex+=2;
            }
        }
        
        return temp;
    }

    
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearragePosNegAlternateInArray(arr)));
    }
}
