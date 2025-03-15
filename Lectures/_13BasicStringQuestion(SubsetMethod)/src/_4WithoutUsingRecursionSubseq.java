import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4WithoutUsingRecursionSubseq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
//        List<List<Integer>> ans = subseq(arr);
//        System.out.println(ans);
//        for (List<Integer> nums : ans){
//            System.out.println(nums);
//        }
        System.out.println(subseqDuplicate(arr));
    }

    static List<List<Integer>> subseq(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();
        //To add empty arraylist to the outer list
        outerList.add(new ArrayList<>());

        for(int num : arr){
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                //outerList.get(i) this will make the innerList as the copy of outerList
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }

        }
        return outerList;
    }

    static List<List<Integer>> subseqDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerList= new ArrayList<>();
        //to create outerlist as a list of empty arraylist
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
               start = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();
            for (int j = start; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
