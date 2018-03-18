package LeetCode;

import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 24/11/17.
 */
public class PathSum {

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode n, int s){
        if (n == null) return 0;
        if (n.right == null && n.left == null) return s*10 + n.val;
        return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
    }
    public static void main(String[] args){
        PathSum p = new PathSum();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(6);
        root.left.right= new TreeNode(4);
        root.right.left = new TreeNode(18);
        root.right.left = new TreeNode(20);

        System.out.print(p.sumNumbers(root));
    }
}
