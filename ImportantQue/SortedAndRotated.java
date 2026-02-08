package ImportantQue;
public class SortedAndRotated {

    static boolean sortedAndRotated(int arr[]){
        int count =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]> arr[(i+1)%n]){
                count ++;
            }
        }
        
        if(count <=1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4, 1, 2};
        System.out.println(sortedAndRotated(arr));
    }
}