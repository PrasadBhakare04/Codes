public class _2OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8};
        int[] arr1 = {7,6,5,3,2,1};
        System.out.println(search(arr, 2));
        System.out.println(search(arr1, 5));
    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isASC = (arr[start] < arr[end]);
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        } return -1;
    }
}
