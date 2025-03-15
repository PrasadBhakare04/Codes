public class _3BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(search(arr, 4, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int s, int e){
        int m = s + (e-s)/2;
        if(s>e){
            return -1;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        if(target > arr[m]){
            return search(arr, target, m+1, e);
        }
        return m;
    }
}
