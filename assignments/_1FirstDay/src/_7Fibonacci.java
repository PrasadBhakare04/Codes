//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;


public class _7Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;
        while(i <= n){
            System.out.println(a + ", ");
            i++;
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println(a);
    }
}
