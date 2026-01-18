public class CheckPrime {

    static boolean checkPrime(int num){

        // base case
        if(num <=1){
            return false;
        }
        if(num==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(num); i++){  // if a factor exists, one of them must be ≤ √36 = 6.
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(23));
    }
}
