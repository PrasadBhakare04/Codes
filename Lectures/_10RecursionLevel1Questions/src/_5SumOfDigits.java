public class _5SumOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }

}
