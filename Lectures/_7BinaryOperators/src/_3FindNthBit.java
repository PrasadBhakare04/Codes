public class _3FindNthBit {
    public static void main(String[] args) {
        int num = 182;
        System.out.println(nthBit(num,5));;//ans = 1 finding the 5th bit of 182
    }
    static int nthBit(int num, int n){
        int ans = num & (1 << (n-1)); //ans will be 16 (i.e any decimal number) so we have to make it either  0 or 1
        return ans != 0 ? 1 : 0;
    }
}
