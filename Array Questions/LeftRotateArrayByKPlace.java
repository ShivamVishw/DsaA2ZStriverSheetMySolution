import java.util.Arrays;

public class LeftRotateArrayByKPlace {

    static int[] leftRotateByDPlace(int arr[], int d){
        if(arr.length ==0){
            return arr;
        }

        int actualD = d%arr.length; // If d is 17 and length is 7 so we dont need to rateta 17th place -- instead 7+7+3 which means 3 place rotattion needed

        int temp [] = new int[actualD];

        // store element till dth in temp arr
        for(int i=0; i<temp.length; i++){
            temp[i] = arr[i];
        }

        // rotate array by dth place
        for(int i=actualD; i<arr.length; i++){  // starte travel from dth place and place the element to left side that is from start for rotatting
            arr[i-actualD] = arr[i];  // Every element are placing at dth left place position
        }

        // Now all done just place starting elemnt to last form temp arr
        int n = arr.length-actualD;  // If array rotated by 3 and toatl array len is 7... so we are remaing for 7-3 i.e from 4 to 7.
        int j=0; // for iterating in temp arr
        for(int i=n; i<arr.length; i++){
            arr[i] = temp[j];
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d= 2;
        System.out.println(Arrays.toString(leftRotateByDPlace(arr, arr.length-d)));
    }
}
