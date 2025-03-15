//Add the sum and the product of the digits of an integer

import java.util.Scanner;
public class _5AddSumandProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(num != 0){
            sum += (num%10);
            product *= (num%10);
            num /= 10;
        }
        System.out.println(sum+product);
    }
}
