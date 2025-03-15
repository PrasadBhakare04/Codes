import java.util.ArrayList;
import java.util.Arrays;

public class _2Subsequence {
    public static void main(String[] args) {
        System.out.println(subseqRet("","abc"));
    }

    static void sbseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        sbseq(p + up.charAt(0), up.substring(1));
        sbseq(p , up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subseqRet(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
