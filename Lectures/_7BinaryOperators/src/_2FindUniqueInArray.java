public class _2FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,5};//ans = 2
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int ans = 0;
        for(int n : arr){
            ans ^= n;
        }
        return ans;
    }
}
