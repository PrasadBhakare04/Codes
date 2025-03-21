public class _4BinarySearchSqrt {
    public static void main(String[] args) {
        System.out.printf("%3f",sqrt(40,4));
    }
    //O(log(sqrt n))
    static int sqrt(int n){
        int s = 0;
        int e = n;
        int result = 0;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m*m == n){
                return m;
            }
            if(m*m > n){
                e = m-1;
            } else {
                s = m+1;
                result = m;
            }
        }
        return result;
    }

    //O(log(n))
    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while(s <= e){
            int m = s + (e - s)/2;
            if(m*m == n){
                return m;
            }
            if(m*m > n){
                e = m-1;
            } else {
                s = m+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i <= p; i++) {
            while(root * root <= n){
                root += incr;
            }
            root -= incr;
            incr = incr/10;
        }
        return root;
    }
}
