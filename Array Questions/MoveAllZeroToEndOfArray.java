import java.util.Arrays;

public class MoveAllZeroToEndOfArray {

    static int[] moveAllZeroToEnd(int nums[]){
       
        int index = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];  // place at index postion which is startign from 0 and after placing increse it by 1 for next element
                index++;
            }else{
                count++;
            }
        }

        // Place 0 at correct position
        for(int i=nums.length - count; i<nums.length; i++){  // starting from n-count means if len of arr is 7 and count of 0 is 2 so we need place 0 from 7-2= 5 .. i.e from 5 to 7 we have to place 0
            nums[i] = 0;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(moveAllZeroToEnd(arr)));
    }
}
