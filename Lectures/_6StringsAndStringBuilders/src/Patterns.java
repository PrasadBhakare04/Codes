public class Patterns {
    public static void main(String[] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);pattern4(5);pattern5(5);pattern6(5);pattern7(5);pattern8(5);
    }

    static void pattern1(int n){
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    static void pattern5(int n){
        for (int i = 1; i <= 2*n -1; i++) {
            int totalCols = i <= n ? i : (2*n)-i;
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <= (2*n)-1; i++) {
            int totalCols = i <= n ? i : (2*n) - i;
            int totalSpaces = n - totalCols;
            for (int j = 1; j <= totalSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void pattern8(int n){
        for (int i = 1; i < (2*n)-1; i++) {
            int totalCols = i <= n ? i : (2*n) - i;
            int spaces = n - totalCols;
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < totalCols; j++) {
                System.out.print(j);
            }
            for (int j = 2; j < n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
