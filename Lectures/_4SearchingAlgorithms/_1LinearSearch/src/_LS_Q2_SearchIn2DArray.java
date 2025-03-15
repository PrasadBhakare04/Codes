import java.util.Arrays;

public class _LS_Q2_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {19,17,13},
                {4,5,19},
                {1,2,15}
        };
        System.out.println(Arrays.toString(searchFor(arr,20)));
    }
    static int[] searchFor(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        } return new int[] {-1, -1};
    }
}
