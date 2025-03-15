//Take inputs from the user till it enters 0 and give the largest of all

import java.util.Scanner;
public class _7LargestTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.println("Enter Number");
            int num = sc.nextInt();
            if(num != 0){
                max = Math.max(max,num);
            }
            else if(num == 0){
                System.out.println("The largest number is: " + max);
                break;
            }
        }
    }
}
