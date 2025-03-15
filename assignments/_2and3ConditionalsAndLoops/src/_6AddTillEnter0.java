//Take the input till user enters 0 and add the inputs

import  java.util.Scanner;
public class _6AddTillEnter0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the number");
            int nums = sc.nextInt();
            if(nums == 0){
                System.out.println(ans);
                break;
            }
            else {
                ans += nums;
            }
        }
    }
}
