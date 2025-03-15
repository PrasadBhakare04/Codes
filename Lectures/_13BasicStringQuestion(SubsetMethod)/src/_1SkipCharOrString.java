public class _1SkipCharOrString {
    public static void main(String[] args) {
        System.out.println(skipString("bcappleaaggd"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0) == 'a'){
            return skip(up.substring(1));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else{
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
}
