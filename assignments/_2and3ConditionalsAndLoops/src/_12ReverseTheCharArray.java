import java.util.*;
public class _12ReverseTheCharArray {
    public static void main(String[] args) {

    }

    static void reverse(char[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}
