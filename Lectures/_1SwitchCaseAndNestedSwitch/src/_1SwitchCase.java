import java.util.Scanner;
public class _1SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch (a) {
            case "Mango":
                System.out.println("King of the fruits");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            default :
                System.out.println("not found");
        }
    }
}
