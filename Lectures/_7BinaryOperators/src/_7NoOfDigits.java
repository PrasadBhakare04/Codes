public class _7NoOfDigits {
    public static void main(String[] args) {
        System.out.println(noOfDigits(6,10));
    }
    static int noOfDigits(int n, int b){
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        return ans;
    }
}
