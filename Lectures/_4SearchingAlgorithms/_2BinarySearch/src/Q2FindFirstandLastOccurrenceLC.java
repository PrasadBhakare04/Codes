import java.util.Arrays;

//leetcode 34
public class Q2FindFirstandLastOccurrenceLC {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    public static int[] searchRange (int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] nums, int target, boolean searchForStart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums [mid] < target){
                start = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else //potential ans found
            {
                ans = mid;
                if (searchForStart){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        } return ans;
    }
}
