package LeetCode;

import java.util.TreeMap;

public class DiameterOfBT {
    static int diameter =1;
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root ==null) return 0;
        getDiameter(root);
        return diameter-1;
    }

    public static int getDiameter(TreeNode root){
        if(root==null)return 0;
        int ldiameter = getDiameter(root.left);
        int rdiameter = getDiameter(root.right);
        diameter =Math.max(ldiameter+rdiameter+1,diameter);
        return Math.max(ldiameter,rdiameter)+1;

    }
    public static void main(String[] args){
        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(7);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode((9));
        node.left.right.left = new TreeNode(10);
        node.right = new TreeNode(12);
        System.out.println(diameterOfBinaryTree(node));

    }
}
