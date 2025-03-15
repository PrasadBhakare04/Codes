//Factorial of entered number

import java.util.Scanner;
public class _2Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" is "+fact(a));
    }
    static int fact(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++){
            if(a == 0 || a == 1){
                return factorial;
            }
            else{
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
