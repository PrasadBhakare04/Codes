public class _8IsNumPowOf2 {
    public static void main(String[] args) {
        System.out.println(isPowOf2(100));//checks in 100 in binary is a power of 2 or not
    }
    static boolean isPowOf2(int n){
        int ans = n & (n-1);
        if(ans == 0){
            return true;
        }
        return false;
    }
}
