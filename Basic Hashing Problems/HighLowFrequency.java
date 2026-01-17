public class HighLowFrequency {
    static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    static void highLowFrequency(int arr[]){
        // Create hash array
        int hash[] = new int[findMax(arr)+1];

        // update hash data according to numbers occured
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]+=1;
        }

        // Now we got our updated hash data so will find which occures hihest and lowest times...
        int highestnum = -1;
        int lowestnum = -1;
        int max_freq = Integer.MIN_VALUE;
        int min_freq = Integer.MAX_VALUE;
        
        for(int i=1; i<hash.length; i++){
            if(hash[i]>0){               // Means it has appeared atleast once so need to check
                if(hash[i]>max_freq){
                    max_freq = hash[i];  // It's tracking maximum frequency of any number so far
                    highestnum = i;      // It'll store that maximum frequency number so far
                }

                if(hash[i]<min_freq){
                    min_freq = hash[i];  // Similarly  .....
                    lowestnum = i; 
                }
            }
        }

        System.out.println("Highest occured number is "+ highestnum);
        System.out.println("Lowest occured number is "+ lowestnum);
       
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,1,1,9,0};
        highLowFrequency(arr);
    }
}
