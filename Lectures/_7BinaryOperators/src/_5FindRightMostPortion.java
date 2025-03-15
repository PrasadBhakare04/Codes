public class _5FindRightMostPortion {
    public static void main(String[] args) {
        System.out.println(rightMost(364));//ans 4
    }
    static int rightMost(int n){
        return  n & (-n);
    }
}
