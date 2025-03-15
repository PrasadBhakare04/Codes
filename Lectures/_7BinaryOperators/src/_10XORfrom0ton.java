public class _10XORfrom0ton {
    public static void main(String[] args) {
      Xor(9);
    }
    static void Xor(int n){
        for (int i = 0; i <= n; i++) {
            if(i % 4 == 0){
               System.out.println(i);
            }
            else if(i % 4 == 1){
                System.out.println(1);
            }
            else if(i% 4 == 2){
                System.out.println(i+1);
            }
            else if(i % 4 == 3){
                System.out.println(0);
            }
        }
    }
}
