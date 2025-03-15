import java.util.ArrayList;

public class _2PrintThePath {
    public static void main(String[] args) {
        System.out.println(printPathRet("",3,3));
    }

    static void printPath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p + 'D', r - 1, c);
        }
        if(c>1){
            printPath(p + 'R',r, c - 1);
        }
    }

    static ArrayList<String> printPathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(printPathRet(p + 'D', r - 1, c));
        }
        if(c>1){
            ans.addAll(printPathRet(p + 'R',r, c - 1));
        }
        return ans;
    }
}
