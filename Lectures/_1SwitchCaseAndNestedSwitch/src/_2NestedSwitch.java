import java.util.Scanner;
public class _2NestedSwitch {
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an id");
       int a = sc.nextInt();
       System.out.println("Enter Department");
       String b = sc.next();
       switch (a){
           case 1:
               System.out.println("Prasad Bhakare");
               break;
           case 2:
               System.out.println("Pratik Kakade");
               break;
           case 3:
               switch (b){
                   case "IT":
                       System.out.println("Cannot tell name but he is From the IT Department");
                       break;
                   case "CS":
                       System.out.println("Cannot tell name but he is From CS Department");
                       break;
               }
               break;
           default:
               System.out.println("Default Case");
       }
   }
}
