//To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class _8Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        for (int i = 0; i<length/2; i++){
            if(s.charAt(0)==s.charAt(length - 1 - i)){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
    }
}}
