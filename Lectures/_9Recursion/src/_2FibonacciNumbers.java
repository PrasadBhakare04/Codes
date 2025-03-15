public class _2FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static int fiboFormula(int n){
        //This is just for the demo use long instead
        return (int) (1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5)/2),n) - Math.pow((1-Math.sqrt(5)/2),n)));
    }
}
