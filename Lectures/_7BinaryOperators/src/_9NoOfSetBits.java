//complexity is O(log n)

public class _9NoOfSetBits {
    public static void main(String[] args) {
        System.out.println(setBits(23456));
    }

    static int setBits(int n){
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while(n > 0){
            count ++;
            n -= n & -n;
        }
        /* or
        while( n > 0){
            count ++;
            n -= n & (n-1);
        }
        */
        return count;
    }
}
