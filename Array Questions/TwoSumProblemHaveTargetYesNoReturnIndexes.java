
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemHaveTargetYesNoReturnIndexes {

    static boolean TwoSumExist(int arr[], int target){
        // First sort it and then use two pointer approach 
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1; 
        int sum =0;
        // Now use 2 pointer approach left and right and parellary calculate sum and if sum >target shift right pointer to left and if sum<target -- shift left pointer to the right side
        while(left< right){
            // Calculate sum with new 2 numbers
            sum = arr[left] + arr[right];

            // if found sum  return 
            if(sum == target){
                return true;
            }

            // if not found move left or right pointer whichever needed based on target and sum
            if(sum<target){
                left++; // Because we need bigger element to add to right index element and get target
            }else{
                right--; // Because we need lower element to add to left index element and get target
            }

        }
        
        return false;
    }

    static int[] TwoSumExistIndexes(int arr[],int target){
      
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            // what we need actually
            int need = target - arr[i]; // this number if there in map we can add those 2 numbers and yes we got our target
        
            if(map.containsKey(need)){
                // it means required number exist which we can add with arr[i] and we got our answer
                return new int[]{map.get(need), i};
            }

            // else not got required need element just add into map for future/upcoming checking
            map.put(arr[i], i);

        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = {2,6,5,8,11};
        int arr[] = {2,6,5,8,11};
        int target = 14;
        System.out.println(TwoSumExist(arr, target));
        System.out.println(Arrays.toString(TwoSumExistIndexes(nums, target)));
    }   
}
