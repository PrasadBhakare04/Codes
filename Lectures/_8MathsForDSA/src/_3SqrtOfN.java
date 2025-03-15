public class _3SqrtOfN {
    public static void main(String[] args) {
        sqrt(64);
    }
    //Brute Force
    static void sqrt(int n){
        for (int i = 1; i < n; i++) {
            if(i * i == n){
                System.out.println("square root of "+n+" is "+i);
                break;
            }
            if(i*i > 40){
                break;
            }
        }
    }
}
