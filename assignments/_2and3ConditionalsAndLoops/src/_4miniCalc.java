//Do the calculation till user presses the X or x

import java.util.Scanner;
public class _4miniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter an operation");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op == '+'){
                    ans = a + b;
                }
                if(op == '-'){
                    ans = a - b;
                }
                if(op == '*'){
                    ans = a * b;
                }
                if(op == '/'){
                    if (b != 0){
                        ans = a / b;
                    }
                }
                System.out.println(ans);
            }
            if(op == 'X' || op == 'x'){
                System.out.println("Invalid operation!!");
                break;
            }
        }

    }
}
