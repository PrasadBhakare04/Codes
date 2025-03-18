package _2BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Implementation bst = new Implementation();
        int[] arr = {9,10,11,12,13};
        bst.populate(arr);

//        bst.display();
//        System.out.println(bst.balanced());
        bst.inOrder();
    }
}
