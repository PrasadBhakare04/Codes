package _12ExceptionHandling;

public class Main {
    public static void main(String[] args)  {
        int a = 10;
        int b = 0;
        try{
            divide(a, b);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("Cannot divide by 0");
        }
        else{
            return a/b;
        }
    }
}
