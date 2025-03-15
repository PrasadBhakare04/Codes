public class _1PrimeOrNot {
    public static void main(String[] args){

    }

    static boolean isPrime(int n){
        int i = 2;
        //i.e i <= sqrt(n) on squaring both sides i * i <= n
        while (i * i <= n) {
            if(n % i == 0){
                return false;
            }
            i++;
        } return true;
    }
    //BruteForce
    static void primeTillN(int n){
        for (int i = 2; i < n; i++) {
            System.out.println(i + " is " +isPrime(i));
        }
    }
}
