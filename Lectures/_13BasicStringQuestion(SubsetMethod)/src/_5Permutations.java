import java.util.*;
public class _5Permutations {
    public static void main(String[] args) {
        System.out.println(permutationsList("", "abc"));
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch  =  up.charAt(0);
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s,up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch  =  up.charAt(0);
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
