public class _2_1TillN {
    public static void main(String[] args) {
        printNumber(5);
    }
    static void printNumber(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
}
