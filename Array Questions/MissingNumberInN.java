public class MissingNumberInN {
    
    static int missingNumber(int arr[], int N){
        // Remember N is always startig from 1 
        int tempHashArr[] = new int[N+1];
        for(int i=0; i<arr.length; i++){
            tempHashArr[arr[i]] = tempHashArr[arr[i]] + 1;
        }

        for(int i=0; i<=tempHashArr.length; i++){   // start from zero for considering zero also 
            if(tempHashArr[i]==0){
                return i;
            }
        }
       
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int N = 10;
        System.out.println(missingNumber(arr, N));
    }
}
