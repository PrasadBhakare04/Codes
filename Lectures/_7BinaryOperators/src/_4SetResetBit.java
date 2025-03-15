/*
Set means   0 -> 1
            1 -> 1

Reset means 0 -> 0
            1 -> 0
*/
public class _4SetResetBit {
    public static void main(String[] args) {
        System.out.println(set(86, 4));//ans = 94 setting the 4th bit of 86
        System.out.println(reset(86, 4));//ans = 86
    }
    static int set(int num, int n){
        return num | (1 << (n-1));
    }

    static int reset(int num, int n){
        return num & ~(1 << (n-1));
    }
}
