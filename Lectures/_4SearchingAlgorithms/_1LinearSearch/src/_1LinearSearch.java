package _1LinearSearch;

public class _1LinearSearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(searchinArray(a, 2));
        System.out.println(searchinStrArray("Prasad",  'z'));
        System.out.println(searchinString("Prasad",  'z'));
    }

    static boolean searchinArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        } return false;
    }

    static boolean searchinString(String a, char ch){
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==ch){
                return true;
            }
        } return false;
    }

    static boolean searchinStrArray(String a, char ch){
        for(char c : a.toCharArray()){
            if(c == ch){
                return true;
            }
        }   return false;
    }
}
