import java.util.*;
public class _2TwoDArrays {
    public static void main(String[] args) {
        int [][] b = {
                {3, 4}, {5, 6}, {7, 8}
        };
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(Arrays.toString(b[i]));
//        }

        for(int[] nums : b){
            System.out.println(Arrays.toString(nums));
        }
    }
}
