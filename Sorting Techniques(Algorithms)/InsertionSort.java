import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int arr[]){

        for(int i =1; i<arr.length; i++){   // i Starts from 1 because we are asssming first element already sorted part.

            int key= arr[i];  // Will start from this second element and this need to place in right position by comparing in sorting array which is means on left side..


            int j= i-1;  // It means all elments till this are already sorted. So will tkae key and compare in left side(i.e sorted part) and place at right position.


            // Let's compare our current element in left sorted array and place at right position.
            while(j>=0 && arr[j]>key){   // arr[j]> key means key or arr[i] need to shift left because it is smaller..

                arr[j+1] = arr[j];
                j--;
            }

            // once we found we don't need to go left more means it 's sorted or we reach at 0th index so insert key at correct position
            arr[j+1] = key;  

        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {23,42,63,3,2,4,9,0,54};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
