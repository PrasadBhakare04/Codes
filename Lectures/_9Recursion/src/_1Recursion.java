public class _1Recursion {
    public static void main(String[] args) {
//        printNum3(1);
        printNum2(5);
    }
    static void printNum(int n){
        if(n != 1){
            printNum(n-1);
            System.out.println(n);
        }
        else{
            System.out.println(n);
        }
    }

    static void printNum2(int n){
        if(n == 1){
            System.out.println(n);
        }
        printNum(n-1);
        System.out.println(n);
    }

    static void printNum3(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum3(n+1);
    }
}
