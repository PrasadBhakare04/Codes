package _3AVLTree;

public class Main {
    public static void main(String[] args) {
        AvlTree avl = new AvlTree();
        for (int i = 0; i < 1000; i++) {
            avl.insert(i);
        }
        System.out.println(avl.getHeight());
    }
}
