import java.util.ArrayDeque;
import java.util.ArrayList;

public class _3SubSeqAscii {
    public static void main(String[] args) {
//        subseq("","abc");
        System.out.println(subseqList("","abc"));
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = subseqList(p + up.charAt(0),up.substring(1));
        ArrayList<String> mid = subseqList(p ,up.substring(1));
        ArrayList<String> right = subseqList(p + (up.charAt(0) + 0),up.substring(1));

        right.addAll(left);
        right.addAll(mid);
        return right;
    }
}
