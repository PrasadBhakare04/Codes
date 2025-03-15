//not the Optimized way but good to know
import java.util.ArrayList;

public class _3ReturningArrayListWithoutPassingArgs {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18};
        System.out.println(returnList(arr,18,0));
    }

    static ArrayList<Integer> returnList(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = returnList(arr, target, index+1);
        list.addAll(ans);
        return list;

    }
}
