import java.util.*;
public class RandomString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sb.append((char) (97 + (random.nextFloat() * 26)));
            }
            System.out.println(sb);
            sb.delete(0,4);
        }
    }
}
