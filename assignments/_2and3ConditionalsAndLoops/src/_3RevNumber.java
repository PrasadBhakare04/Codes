//Reverse the entered number

import java.util.Scanner;
public class _3RevNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int revNum = 0;
        while(num != 0){
            revNum = (revNum*10) + num%10;
            num /= 10;
        }
        System.out.println(revNum);
    }
}
