public class _LS_Q1_MinimumNum {
    public static void main(String[] args) {
       int[] arr = {1, 2, 4, 5, 6};
        System.out.println(minimumNum(arr));
    }
    static int minimumNum(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        } return min;
    }
}
