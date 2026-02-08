import java.util.Arrays;

public class Sort012DutchNationalFlagAlgorithm {
  

    static int[] sort012(int arr[]){
        
        // Intitating mid and high hypothetically by defination of dutch national flag algorithms 

        int low = 0; // low will be always at starting 
        int mid = 0; // again it will also be always at 0 at startign because out is unsorted and which we need to sort (unsported part are mid to high) -- we need to sort so first index will be mid and last index will be hugh at starting and now our mid will move and check and do the swapping as required
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] ==0){
                // Swap with low index element 
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                // low will be incremented forword because 0 is placed at 0 so 0th part of aray is srted
                // mid will be also incremented to forward because that left part is sorted till now
                low++;
                mid++;
            }else if(arr[mid] ==1){
                // as arr[mid] is 1 so it is at it's right sorted order position so we just need to shift mid to forward because till mid 0 and 1's are already sorted
                mid++;
            }else{
                // As 2 occurs and 
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp; 
                // right side now already sorted .. so shift high pointer to one step backward(left side)
                high--; 
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,1,2,1,2,0,2,2,0,0};
        System.out.println(Arrays.toString(sort012(arr)));
    }
}

// Optimal Solution --- Rocked it
// The problem is similar to "Segregate 0s and 1s in an array". The idea is to sort the array of size n using three pointers: lo = 0, mid = 0 and hi = n - 1 such that the array is divided into 4 parts -

// arr[0 .. lo - 1] → All 0s
// arr[lo .. mid - 1] → All 1s
// arr[mid .. hi] → Unprocessed elements (unknown)
// arr[hi + 1 .. n - 1] → All 2s
// Here,

// lo is the index where the next 0 should be placed,
// mid is the current element being checked,
// hi is the index where the next 2 should be placed.