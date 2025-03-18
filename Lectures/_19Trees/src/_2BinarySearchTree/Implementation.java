package _2BinarySearchTree;
import java.util.Scanner;

public class Implementation {
    private  class Node{
        int height;
        Node right;
        Node left;
        int val;
        public Node(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }
    Node root;
    public Implementation(){
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "left child of " + node.getValue() + " : ");
        display(node.right, "right child of " + node.getValue() + " : ");
    }


    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.getValue()){
            node.left = insert(value, node.left);
        }
        if(value > node.getValue()){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        // after all the checks we found that the value is actually equal to the current node
        // So we return the current node
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
    public void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length - 1);
    }

    private void populateSorted (int [] arr, int start, int end){
        if(start > end){
            return;
        }
        int mid = start + (end - start) / 2;
        insert(arr[mid]);
        populateSorted(arr, start, mid - 1);
        populateSorted(arr, mid + 1, end);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.getValue() + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue() + " ");
    }

}
