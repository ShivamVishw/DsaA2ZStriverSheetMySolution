
import java.util.HashMap;
import java.util.Map;

public class MajorityElementNBy2 {

    static int majorityElementByMap(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1);


            if(map.get(arr[i])> arr.length/2){
                return arr[i];
            }
        }

        return -1;
    }

    static int majorityElementByMooresVotingAlgo(int arr[]){
        
        if(arr.length ==0){
            return -1;
        }

        int count =0;
        int candidate =0;

        for(int curr: arr){
            if(count ==0){
                candidate = curr;
            }

            // and 
            if(curr == candidate){
                count++;
            }else{
                count--;
            }
        }

        // Exception when n/2 exist in array is not gurenteed otherqise if n/2 element exist in arr provided then we can directly return candidate without this coundition.
        if(count < arr.length/2){
            return  -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,4,4,4,4,1,2,2};
        System.out.println(majorityElementByMap(arr));  // It will give always right solution whether n/2 element exist or not
        System.out.println(majorityElementByMooresVotingAlgo(arr));  // Works alwayas only when it's gurenteed n/2 element exist in the array
    }
}
