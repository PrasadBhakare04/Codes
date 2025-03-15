//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;

public class _3SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount you want to invest");
        float p = input.nextInt();
        System.out.println("Enter the time");
        float t = input.nextInt();
        System.out.println("Enter the rate");
        float r = input.nextInt();
        float interest = p*(r/100)*t;
        System.out.println(p + interest);
    }
}
