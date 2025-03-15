//To find Armstrong Number between two given number.

import java.util.Scanner;
public class _9ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a;
        int c = 0;
        while(a != 0){
            int b = a % 10;
            c = c+(b*b*b);
            a = a/10;
        }
        if (c == x){
            System.out.println("It IS");
        } else {
            System.out.println("It is NOT");
        }
    }
}
