import java.util.*;

public class _4CyclicSort {
    public static void main(String[] args) {
        int[] arr = {0,1,3,8,2,4,5,6,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void sort(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                //correctIndex = arr[i] - N, where N is the start of the range
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }
        }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
