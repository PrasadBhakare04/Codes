//Avl tree is one of the self balancing binary search trees self balancing means the height difference of
//right and left subtree at any node <= 1

package _3AVLTree;

import _2BinarySearchTree.Implementation;

public class AvlTree {
    private class Node {
        int val;
        int height;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
            height = 0;
        }
    }
    Node root;
    public Node insert(int val){
        return root = insert(root, val);
    }

    public int getHeight(){
        return root == null ? -1 : root.height;
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    private Node insert(Node node, int val){
        if(node == null){
            return new Node(val);
        }
        else if(val > node.val){
            node.right = insert(node.right, val);
        }
        else if(val < node.val){
            node.left = insert(node.left, val);
        }

        else {
            return node;  // No duplicates allowed
        }
        node.height = Math.max(getHeight(node.right), getHeight(node.left)) + 1;

        //This will check the four cases and return the root node after all the rotations
        return rotate(node);
    }

    private Node rotate(Node node){
        if(getHeight(node.left) - getHeight(node.right) > 1){
            //left heavy
            //After this we will check the cases whether left-left or left-right
            if(getHeight(node.left.left) - getHeight(node.left.right) > 0){
                //left-left case
                return rightRotate(node);
            }
            if(getHeight(node.left.left) - getHeight(node.left.right) < 0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(getHeight(node.left) - getHeight(node.right) < -1){
            //right heavy
            //After this we will check the cases whether right-left or right-right
            if(getHeight(node.right.left) - getHeight(node.right.right) > 0){
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
            if(getHeight(node.right.left) - getHeight(node.right.right) < 0){
                //right-right case
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;
        return c;
    }

    public Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;
        return c;
    }
}
