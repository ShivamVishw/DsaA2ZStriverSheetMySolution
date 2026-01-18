// Factorial of N numbers

public class FactorialOfNumber {

    static int fact_n(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            System.out.println("Invalid number");
            return -1;
        }

        return num*fact_n(num-1);

    }

    public static void main(String[] args) {
        System.out.println(fact_n(3));
    }
}
