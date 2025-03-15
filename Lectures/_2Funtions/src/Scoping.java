import java.util.Arrays;
public class Scoping {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = a;
        b[0] = 5;
        System.out.println(Arrays.toString(b));
    }
}
