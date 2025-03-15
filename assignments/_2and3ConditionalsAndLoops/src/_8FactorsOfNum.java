//Take a number from user and print all the factors

import java.util.Scanner;
public class _8FactorsOfNum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        for(i = 1; i <= a/2;){
            if((a%i)==0){
                System.out.print(i+" ");
                i++;
            }
            i++;
        }
        System.out.print(a);
    }
}
