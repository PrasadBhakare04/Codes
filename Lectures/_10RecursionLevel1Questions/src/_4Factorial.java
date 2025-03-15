public class _4Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(620));
        System.out.println(sum(5));
    }
    static int productOfN(int n){
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum (int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
