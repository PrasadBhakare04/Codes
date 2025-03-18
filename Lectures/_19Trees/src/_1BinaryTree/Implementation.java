package _1BinaryTree;
import java.util.Scanner;
public class Implementation {

    Scanner sc = new Scanner(System.in);
    public Implementation(){
        populate(sc);
    }
    private class Node {
        int val;
        Node right;
        Node left;
        public Node (int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate (Scanner scanner){
        System.out.println("Enter root node");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public Node getRoot(){
        return root;
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter value on the left of" + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter in the right of " + node. val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to right" + + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "/t");
        display(node.right, indent + "/t");
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
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
        System.out.print(node.val + " ");
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
        System.out.print(node.val + " ");
    }
}
