package ImportantQue;

import java.util.HashMap;

public class CountPairWithGivenSum {

    static int countPairWithGivenSumK(int arr[], int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0; i<arr.length; i++){
            int needed = k - arr[i];

            if(map.containsKey(needed)){
                count+= map.get(needed); // ok so it is frequnece of needed occured right  for example if 5 is needed and 5 is there 3 times so 3 pairs can be there
            }

            // else add into map for upcoming check
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }

        return count;
    }


    static int [] GivePairWithGivenSumK(int arr[], int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int needed = k - arr[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed), i};
            }

            // else add into map for upcoming check
            map.put(arr[i], i);

        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = {2,3,45,63,2,63,242,3,4,5,2,4};
        System.out.println(countPairWithGivenSumK(arr, 4));
    }
}
