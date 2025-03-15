public class _1EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isEven(68));
        System.out.println(isOdd(67));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    static boolean isEven(int n) {
        if((n & 1) == 1){
            return false;
        }
        return true;
    }
}
