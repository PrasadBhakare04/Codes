package Questions;
import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()()[]{}}}";
        System.out.println(ans(s));
    }
    static boolean ans(String s){
        Stack<Character> stack = new Stack<>();
        if(s.length() == 1){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
