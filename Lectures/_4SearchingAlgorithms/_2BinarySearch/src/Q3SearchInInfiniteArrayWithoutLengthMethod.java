public class Q3SearchInInfiniteArrayWithoutLengthMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,10,10,161,388,777,779,781,5555,100000,1000003,19090909};
        System.out.println(ans(arr,1000003));
    }
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        } return binarySearch(arr,target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] == target){
                return mid;
            }
        } return -1;
    }
}
