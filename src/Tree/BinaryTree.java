package Tree;
import com.sjsu.cs146.project2.*;

import java.lang.Math;
import java.util.Random;

public class BinaryTree extends BinarySearchTree<Integer> {
    static Node head;
    private int data;
    /* Given a binary search tree and a number,
	inserts a new node with the given number in
	the correct place in the tree. Returns the new
	root pointer which the caller should then use
	(the standard trick to avoid using reference
	parameters). */
    Node insert(Node node, int data) {
        /* 1. If the tree is empty, return a new,
		single node */
        if (node == null) {
            return (new Node(data));
        } else {
            	/* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

			/* return the (unchanged) node pointer */
            return node;
        }
    }

    /* Given a non-empty binary search tree,
	return the minimum data value found in that
	tree. Note that the entire tree does not need
	to be searched. */
    int minValue(Node node) {
        Node current = node;

    /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }
    int maxValue(Node node) {
        Node current = node;

    /* loop down to find the leftmost leaf */
        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }
//to search an element
    public boolean contains(int x,Node node){
        if(node==null){
            return false;
        }
        //int compareResult=x.compareTo(node.data);
        else {
            if (x < node.data) {
                return contains(x, node.left);
            } else if (x > node.data) {
                return contains(x, node.right);
            }
        }

            return true;

    }

    public Node remove(Node node,int data){
        if (node == null) {

            return node;
        }
        else if (data < node.data) {
                node.left = remove(node.left, data);
            }
         else if(data>node .data){
            node.right=remove(node.right,data);
        }
        else if(node.left!=null&& node.right!=null){
            node.data=minValue(node.right);
            node.right=remove(node.right,node.data);
        }
        else{
            node=(node.left!=null)?node.left :node.right;
        }
        return node;
    }

    //height of a tree


    int height(Node node){
        if(node==null){
            return -1;
        }
        else{
            return 1+Math.max(height(node.left),height(node.right));
        }
    }

//    int randomGenerator() {
//        Random rand = new Random();
////        int[] a = new int[];
////        int i ;
////        for (i = 0;i< 50;i++){
////         a.
////        }
//        int num = rand.nextInt(89) + 10;
//        return num;
//    }
// Driver program to test above functions

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null;
        root = tree.insert(root, 30);
        int min = 10;
        int max = 100;

        Random rand = new Random();

        while(tree.height(root) < 5)
        {
            tree.insert(root,rand.nextInt(max - min) + min);
            new TreePrinter(tree).print("BST");
        }

//        tree.insert(root, 2);
//        tree.insert(root, 1);
//        tree.insert(root, 3);
//        tree.insert(root, 6);
//        tree.insert(root, 5);
//        tree.insert(root, 8);
//        tree.insert(root, 7);
//        tree.insert(root, 14);
//        tree.insert(root, 12);
        System.out.println("height of the tree is:"+tree.height(root));
//        System.out.println("Element removed is:"+tree.remove(root,8));
//        System.out.println("Element found is:"+tree.contains(12,root));
//        System.out.println("Element found is:"+tree.contains(8,root));
//        System.out.println("Min value of BST is:"+tree.minValue(root));
//        System.out.println("Max value of BST is:"+tree.maxValue(root));
    }
}
