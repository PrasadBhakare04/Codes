public class _1NTill1 {
    public static void main(String[] args) {
        printNumber(5);
    }
    static void printNumber(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
