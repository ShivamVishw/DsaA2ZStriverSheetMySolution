package ImportantQue;
public class MissingNumber {

    // FIrst way is to use hashing ot get to know which number missing easoly 


    // Opmize through XOR
    // XOR rules remember .. same cancel each other

    static int missingNumberByXOR(int arr[], int N){
        int xor1 = 0;
        int xor2 = 0;

        // get xor for all numbers from 1 to N
        for(int i=1; i<=N; i++){    
            xor1= xor1^i;
        }

        // get xor for all elements in the array 
        for(int i=0; i<arr.length; i++){
            xor2= xor2^arr[i];
        }

        return xor1^xor2;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7};
        int N = arr.length+1;
        System.out.println(missingNumberByXOR(arr, N));
    }
}
