package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 20/11/17.
 */
public class BSTtoLL {
    public void flattenLL(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        TreeNode node = null;
        while(!st.isEmpty()){
            node = st.pop();
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);

            if(!st.isEmpty()){ node.right = st.peek(); } // keeping next node
            node.left = null;
        }


    }
    public void flattenDLL(TreeNode root) {
        if(root==null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode node = null;
        TreeNode prev =null;
        while(!q.isEmpty()){
            node = q.poll();
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            node.right = q.peek();
            node.left = prev;
            prev = node;
        }


    }
}
