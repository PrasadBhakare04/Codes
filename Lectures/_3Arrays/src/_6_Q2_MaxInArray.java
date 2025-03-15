import java.util.*;
public class _6_Q2_MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,66,77,33,55};
        System.out.println(findMax2(arr));
    }
    static int findMax(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    };

    static int findMax2(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    };
}
