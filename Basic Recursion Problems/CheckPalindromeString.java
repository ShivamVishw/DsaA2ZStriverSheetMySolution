public class CheckPalindromeString {

    static void checkPalindrome(String name, String temp, int i){
        
        // Base case 
        // When we completed operation and i becomes -1
        if(i<0){
            if(temp.equals(name)){
                System.out.println("Plaindrome");
            }else{
                System.out.println("Not palindrome");
            }

            return;
        }

        // Calculate new String
        temp = temp + name.charAt(i);

        // Recursively call by decrementing i by 1
        checkPalindrome(name, temp, i-1);
        
    }

    public static void main(String[] args) {
        String name ="nitin";
        checkPalindrome(name, "", name.length()-1);
    }
}
