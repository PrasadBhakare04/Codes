public class Palindrome {
    public static void main(String[] args) {
        String a = "madam";
        a = a.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < (a.length() - 1) / 2; i++) {
            isPalindrome = true;
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);
            if (start == end) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
