package _11Generics;

public class _4LambdaFunction implements Operation{
    public static void main(String[] args) {

    }

    Operation addition = (a, b) -> a + b;
    @Override
    public int operation(int a, int b) {
        return 0;
    }
}
interface Operation{
    int operation(int a, int b);
}
