public class CheckPalindrome {
    
    static boolean checkPalindrome(int num){
        
        int reversedNumber=0;
        int temp= num;
        while(num>0){
            int rem = num%10;
            reversedNumber = reversedNumber*10+ rem;
            num= num/10;
        }

        if(temp==reversedNumber){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(35653));
    }
}
