//Find the HCF

import java.util.Scanner;
public class _10HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 0;
        for(int i = 1; i<=Math.max(a/2, b/2); i++){
            if(a%i == 0 && b%i==0) {
                hcf = Math.max(i, hcf);
            }
        }
        System.out.println(hcf);
    }
}
