public class _6Factors {
    public static void main(String[] args) {
        factors2(36);
    }
    //Brute Force
    //O(n)
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    //Optimal
    //O(log(sqrt n))
    static void factors2(int n){
        System.out.print(1+" ");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
