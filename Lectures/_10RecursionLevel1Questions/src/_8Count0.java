public class _8Count0 {
    public static void main(String[] args) {
        System.out.println(count(1312554,0));
    }

    static int count(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return count(n/10,++c);
        }
        return count(n/10,c);
    }
}
