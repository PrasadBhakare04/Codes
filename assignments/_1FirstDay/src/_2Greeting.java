//Take name as input and print a greeting message for that particular name

import java.util.Scanner;

public class _2Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String a = input.nextLine();
        System.out.println("hello " + a);
    }
}
