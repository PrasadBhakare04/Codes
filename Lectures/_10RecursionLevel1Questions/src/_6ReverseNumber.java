public class _6ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
//        System.out.println(sum);
    }

    //way 1
    static int sum = 0;
    static void reverse1(int n){
        if(n == 0){
            return;
        }
        int remainder = n%10;
        sum = sum*10 + remainder;
        reverse1(n/10);
    }

    //Way 2
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits-1);
    }
}
