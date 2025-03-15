//Occurrences of a in a number

import java.util.Scanner;
public class _2Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter the number of which you want to find the occurrences");
        int b = sc.nextInt();
        int count = 0;
        while(num != 0){
            if(num%10 == b){
                count++;
                num /= 10;
            }
            else {
                num = num/10;
            }
        }
        System.out.println(count);
    }
}
