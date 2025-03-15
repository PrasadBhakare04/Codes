import java.util.Arrays;

public class _2MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,6,7};
        int[] ans = divide(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] divide(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        //This recursively divides the array in half till the length becomes one
        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
