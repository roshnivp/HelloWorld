package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    static List<Integer> result = new ArrayList<>();
    public static List<Integer> rightSideView(TreeNode root) {
        if(root==null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node==null) continue;
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
            if(q.peek()==null){//finding out the end of the level
                result.add(node.val);
                q.add(null);
            }
        }
        return result;
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(6);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(7);
        rightSideView(node);
    }
}
