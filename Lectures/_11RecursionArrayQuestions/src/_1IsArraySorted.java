public class _1IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5};
        System.out.println(isSorted(arr,0));
    }

    //brute force
    static boolean sorted(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        else if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);
    }

    //optimal
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}
