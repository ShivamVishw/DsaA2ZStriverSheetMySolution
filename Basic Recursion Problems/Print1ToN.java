public class Print1ToN {

    static void print1ToN(int num, int count){
        // Base condition
        if(count > num){
            return;
        }

        System.out.println(count);

        print1ToN(num, count+1);
    }

    public static void main(String[] args) {
        print1ToN(10, 1);
    }
}
