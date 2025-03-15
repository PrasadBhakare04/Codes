import java.util.Scanner;
public class _1ArmStrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
        isArmstrong(153);
    }
    static boolean isArmstrong(int n){
        int original = n;
        int a = 0;
        while(n != 0){
            int rem = n%10;
            a += rem*rem*rem;
            n = n/10;
        }
        if(original == a){
            return true;
        }
        else {
            return false;
        }
    }
}
