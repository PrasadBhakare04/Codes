//Input currency in rupees and output in USD.

import java.util.Scanner;

public class _6INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Indian rupees");
        float a = sc.nextInt();
        System.out.println(a + " rupees in usd " + a*84.09);
    }
}
