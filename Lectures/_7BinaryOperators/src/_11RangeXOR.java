public class _11RangeXOR {
    public static void main(String[] args) {
        int e = 9;
        int s = 3;
        System.out.println(rangeXor(9) ^ rangeXor(s-1));
    }
    static int rangeXor(int e){
        int xor = 0;
        for (int i = 0; i <= e; i++) {
            if(i % 4 == 0){
                xor = i;
            }
            else if(i % 4 == 1){
                xor = 1;
            }
            else if(i% 4 == 2){
                xor = i+1;
            }
            else if(i % 4 == 3){
                xor = 0;
            }
        }
        return xor;
    }
}
