public class _5NewtonRaphsonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            //this is error lesser the number precise the answer but more steps will be taken
            if(Math.abs(root - x) < 0.5){
                break;
            }
            else{
                x = root;
            }
        }
        return root;
    }
}
