import java.util.ArrayList;
import java.util.Arrays;

public class _2LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18};
//        System.out.println(linearSearchIndex(arr, 18, 0));
//        multipleOccurrences(arr, 18, 0);
//        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(returnList(arr,18,0, list2));
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index+1);
    }

    static int linearSearchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        else if(arr[index] == target){
            return index;
        }
       else{
           return linearSearchIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void multipleOccurrences(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        multipleOccurrences(arr, target, index+1);
    }

    static ArrayList<Integer> returnList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return returnList(arr, target, index+1, list);
    }
}
