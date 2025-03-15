import java.util.*;

public class _11SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[secondLargest(arr)]);
    }

    static int secondLargest(int[] arr){
        int secondLarge = 0;
        int large = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[secondLarge]){
                if(arr[i]>arr[large]){
                    secondLarge = large;
                    large = i;
                }
                else{
                    secondLarge = i;
                }
            }
        }
        return secondLarge;
    }
}
