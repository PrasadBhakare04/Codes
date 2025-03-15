import java.util.ArrayList;

public class _6PhonePad {
    public static void main(String[] args) {
        System.out.println(phonePadRet("","23"));
    }

    static void phonePad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = ((digit -1) * 3); i < (digit * 3); i++){
            if(i == 26){
                return;
            }
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> phonePadRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = ((digit - 1) * 3); i < (digit * 3); i++){
            if(i == 26){
                return ans;
            }
            char ch = (char) ('a' + i);
            ans.addAll(phonePadRet(p + ch, up.substring(1)));
        }
        return ans;
    }

    static ArrayList<String> phonePadRetLeetcode(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        int start = 0;
        int end = 0;
        if(digit < 7){
            start = (digit-2) * 3;
            end = ((digit-1) * 3) - 1;
        }
        if(digit == 7){
            start = (digit - 2) * 3;
            end = (digit - 1) * 3;
        }
        if(digit == 8){
            start = ((digit - 1) * 3) - 2;
            end = (digit - 1) * 3;
        }
        if(digit == 9){
            start = ((digit - 1) * 3) - 2;
            end = 25;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = start; i <= end; i++){
            if(i == 26){
                return ans;
            }
            char ch = (char) ('a' + i);
            ans.addAll(phonePadRetLeetcode(p + ch, up.substring(1)));
        }
        return ans;
    }
}
