//check the case is uppercase or lowercase

import java.util.Scanner;

public class _1CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char a = sc.next().trim().charAt(0);
        if(a >= 'a' && a<='z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("upper case");
        }
    }
}
