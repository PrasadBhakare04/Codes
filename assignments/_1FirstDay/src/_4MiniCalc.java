//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class _4MiniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        char op = sc.next().charAt(0);
        if (op =='-'){
            System.out.println(a-b);
        }
        else if (op =='+'){
            System.out.println(a+b);
        }
        else if (op =='*'){
            System.out.println(a*b);
        }
        else if (op =='/'){
            System.out.println(a/b);
        }
    }
}
