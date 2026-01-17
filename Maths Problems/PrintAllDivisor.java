// Given an integer N, return all divisors of N.
// A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

public class PrintAllDivisor {
    static void printAllDivisor(int num){
        for(int i=num; i>=1; i--){
            if(num%i==0){
                System.out.println("Divisors: "+ i);
            }
        }
    }
    public static void main(String[] args) {
        printAllDivisor(20);
    }
}
