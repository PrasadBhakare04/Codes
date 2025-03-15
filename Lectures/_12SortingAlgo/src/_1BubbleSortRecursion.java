import java.util.Arrays;

public class _1BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        bubble(arr,arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int pass, int c){
        if(pass == 0){
            return;
        }
        if(c < pass){
            if(arr[c]>arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, pass, c+1);
        }
        else{
            bubble(arr, pass-1, 0);
        }

    }
}
