package LeetCode;

import java.util.Stack;

public class MinBSTNodeDistance {

    public static void main(String[] args){
        TreeNode node = new TreeNode(5);
        node.left=new TreeNode(3);
        node.right= new TreeNode(8);
        node.left.left=new TreeNode(2);
        System.out.println(minDistance(node));
    }

    public static int minDistance(TreeNode root){
        int min = Integer.MAX_VALUE;
        Stack<TreeNode> st = new Stack<>();
        TreeNode prev= null;
        while(!st.isEmpty()|| root!=null){
            while(root!=null){
                st.push(root);
                root= root.left;
            }
            root = st.pop();
            if(prev!=null){
                min= Math.min(min, Math.abs(prev.val-root.val));
            }
            prev= root;
            root=root.right;

        }
        return min;
    }
}
