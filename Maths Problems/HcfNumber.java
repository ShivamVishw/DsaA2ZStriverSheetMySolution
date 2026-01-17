public class HcfNumber {

    static int hcfNumber(int num1, int num2){
        int n=0;
        if(num1>num2){
            n=num2;
        }else{
            n=num1;
        }

        for(int i =n; i>=1; i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(hcfNumber(20, 15));
    }   
}
