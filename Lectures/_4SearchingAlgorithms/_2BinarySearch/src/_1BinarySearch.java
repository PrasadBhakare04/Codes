public class _1BinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 3, 4, 4};
        int target = 3;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                System.out.println(mid);
                break;
            }
        }
    }
}
