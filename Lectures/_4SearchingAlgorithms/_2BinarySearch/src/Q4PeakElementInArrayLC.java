//leetcode 852 and 162
public class Q4PeakElementInArrayLC {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        } return arr[start];
    }
}

