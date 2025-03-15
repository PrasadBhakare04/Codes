//Was asked in Amazon
//Complexity of the loop is Olog(n)

public class _6NthMagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNo(3));//ans = 30
    }
    static int magicNo(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
