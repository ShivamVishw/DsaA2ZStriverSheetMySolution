// Counting frequencies of array elements

public class COuntFrequenciesOfArray {

    static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    static void countFrequency(int arr[]){
        int hash[] = new int[findMax(arr)+1];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] +=1;
        }

        // Index (i) → number from original array
        // Value (hash[i]) → how many times that number occurred
        // hash[i] == 0 → number never appeared
        // hash[i] > 0 → number appeared

        for(int i=0; i<arr.length; i++){
            if(hash[i]>0){
                System.out.println(i + " has occured "+ hash[i]+ " times.");
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,9,5,4,3,2,1,0,5,9};
        countFrequency(arr);
    }
}
