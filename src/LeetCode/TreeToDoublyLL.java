package LeetCode;

import java.util.Stack;

public class TreeToDoublyLL {
    public static TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return root;
        Stack<TreeNode> st = new Stack<>();

        TreeNode node = root;
        TreeNode prev = null;
        TreeNode first = null;


        while (!st.isEmpty() || node != null) {
            while (node != null) {
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            if (first == null) {
                first = node;
            }
            if (prev != null) {
                node.left = prev;
                prev.right = node;
            }
            prev = node;
            node = node.right;
        }
        first.left = prev;
        prev.right = first;

        return first;


    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left= new TreeNode(1);
        node.left.right= new TreeNode(3);
        node.right= new TreeNode(5);
        treeToDoublyList(node);
    }
}
