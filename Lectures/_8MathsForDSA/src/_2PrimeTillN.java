public class _2PrimeTillN {
    public static void main(String[] args) {
//        primeTillN(40);
        int n = 40;
        boolean[] arr = new boolean[n+1];
        primetillN(40, arr);
    }
    //Bruteforce approach O(n * sqrt(n))
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
    static void primeTillN(int n){
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


    //Optimal approach
    //false in array means the number is prime
    //O(n * log(log(n)))
    static void primetillN(int n, boolean[] primes){
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.println(i);
            }
        }
    }
}
