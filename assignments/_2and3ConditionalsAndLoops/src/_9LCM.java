//find the lcm of 2 numbers

import java.util.Scanner;
public class _9LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The LCM is: "+ (a*b));
    }
}
