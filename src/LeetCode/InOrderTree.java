package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 04/03/17.
 */

public class InOrderTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls= new ArrayList<>();
        if (root == null) {
            return ls;
        }

        //keep the nodes in the path that are waiting to be visited
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        //first node to be visited will be the left one

        // traverse the tree
        while (stack.size() > 0 || node!=null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            // visit the top node
            node = stack.pop();
            ls.add(node.val) ;
            node = node.right;

        }
        return ls;

    }

    public static void main(String[] args){
        InOrderTree in = new InOrderTree();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(6);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(7);
        root.right.left = new TreeNode(14);
        root.right.left = new TreeNode(12);

        List<Integer> ans= in.inorderTraversal(root);
        System.out.print(ans.toString());

    }
}
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }