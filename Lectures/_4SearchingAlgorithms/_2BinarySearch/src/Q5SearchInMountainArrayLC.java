public class Q5SearchInMountainArrayLC {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int target = 3;
        int peak = peakElement(arr);
        int firstTry = orderAgnosticBS(arr, 0, peak, target);
        if(firstTry == -1){
            int secondTry = orderAgnosticBS(arr, peak, arr.length-1, target);
            System.out.println(secondTry);
        }
        System.out.println(firstTry);
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if(arr[start]<arr[end]){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
            }
            else if(arr[start]>arr[end]){
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid - 1;
                }
            }
        } return -1;
    }
}
