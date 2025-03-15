public class _7GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(2,7));
        System.out.println(LCM(2,7));
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    //Brute Force
    static int lcm(int a, int b){
        int i = 1;
        while(i <= a * b){
            if(i%a == 0 & i%b == 0){
                return i;
            }
            i++;
        }
        return i;
    }
    //optimal
    static int LCM(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
