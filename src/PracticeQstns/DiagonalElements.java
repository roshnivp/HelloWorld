package PracticeQstns;

import LeetCode.InOrderTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DiagonalElements {

    public static void main(String[] args){

        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(6);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(7);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(12);
        DiagonalElements d = new DiagonalElements();
        d.diagonalTraversal(root);



    }

    void diagonalTraversal(TreeNode root){
        TreeNode p = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(p);
        q.add(null);

        while(!q.isEmpty())
        {
            TreeNode node = q.poll();

            if(node == null){
                q.add(null);
                System.out.println();
                node= q.poll();
                if(node==null) break;
            }
            while(node!=null){
                System.out.print(node.val);
                System.out.print(" ");
                if(node.left!=null){
                    q.add(node.left);
                }
                node = node.right;

            }
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}