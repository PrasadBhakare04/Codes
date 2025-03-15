//Asked in Google
//Leetcode 832

public class _12FlippingImage {
    public static void main(String[] args) {

    }
    static int[][] flip(int[][] arr){
        for(int[] row : arr){
            for (int i = 0; i <= row.length / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return arr;
    }
}
