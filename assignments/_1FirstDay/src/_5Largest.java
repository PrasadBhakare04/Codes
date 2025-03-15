//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class _5Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a > b) {
            System.out.println(a + " is bigger");
        } else {
            System.out.println(b + " is bigger");
        }
    }
}
