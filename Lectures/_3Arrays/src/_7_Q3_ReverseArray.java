import java.util.*;
public class _7_Q3_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5};
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }
    //My method
    static void reverse(int[] arr){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i]=arr[arr.length - i - 1];
            arr[arr.length- i- 1] = temp;
        }
    }
    //Kunal's Method
    static void reverse2(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static int[] swap(int arr[], int start, int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
