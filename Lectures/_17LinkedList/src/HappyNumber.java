/*the number is said to be a happy number if the addition of squares of digits of the number is 14
e.g 19
1^2 + 9^2 = 1 + 81 = 82
8^2 + 2^2 = 64 + 4 = 68
6^2 + 8^2 = 36 + 64 = 100
1^2 + 0^2 + 0^2 = 1
therefore 19 is happy number
*/

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(82));
    }
    static public boolean isHappy(int n){
        int fast = n;
        int slow = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(fast != slow);
        if(slow == 1){
            return true;
        }
        else{
            return false;
        }
    }

    static public int square(int n){
        int ans = 0;
        while(n != 0){
            int rem = n%10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
}
