
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

    static int[] unionTwoSortedArray(int arr1[], int arr2[]){
        Set<Integer> st = new TreeSet<>();

        // Add from first array
        for(int i=0; i<arr1.length; i++){
            st.add(arr1[i]);
        }

        // Add from second array
        for(int i=0; i<arr2.length; i++){
            st.add(arr2[i]);
        }
        int size = st.size();
        int unionArr[] = new int[size];

        int j=0;
        for(int i: st){
            unionArr[j]=i;
            j++;
        }


        return unionArr;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};  
        int arr2[] = {2,3,4,4,5,11,12};
        System.out.println(Arrays.toString(unionTwoSortedArray(arr1, arr2)));
    }
}
