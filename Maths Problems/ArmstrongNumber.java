// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

public class ArmstrongNumber {

    static int countDigit(int num){
        
        int count=0;
        while(num>0){
            count++;
            num= num/10;
        }
        
        return count;
    }

    static boolean checkArmstrong(int num){

        int size = countDigit(num);
        int sum=0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            sum = (int) (sum+ Math.pow(rem, size));
            num= num/10;
        }
        if(sum == temp){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkArmstrong(373));
    }
}
