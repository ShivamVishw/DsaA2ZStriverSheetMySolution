public class CheckIfArraySorted {

    static boolean sortedOrNot(int arr[]){
        for(int i=1; i<arr.length; i++){  // 0th index not need to start because we start comparing from next element 
            if(arr[i]>=arr[i-1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5};
        System.out.println(sortedOrNot(arr));
    }
}