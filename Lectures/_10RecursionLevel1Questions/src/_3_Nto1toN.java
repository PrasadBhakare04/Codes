public class _3_Nto1toN {
    public static void main(String[] args) {
       printboth(5);
    }
    static void printboth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);
    }
}
