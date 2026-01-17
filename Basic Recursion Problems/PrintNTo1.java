public class PrintNTo1 {
    static void printNTo1(int num){
        if(num==0){
            return;
        }

        System.out.println(num);

        printNTo1(num-1);
    }

    public static void main(String[] args) {
        printNTo1(4);
    }
}
