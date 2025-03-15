import java.util.Arrays;

public class Builder {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder("Hello world");
//        System.out.println(builder);
        builder.append(" Hello world again");
//        System.out.println(builder);
        String name = "hello world";
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
