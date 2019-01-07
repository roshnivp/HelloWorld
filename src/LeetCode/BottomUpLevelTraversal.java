package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomUpLevelTraversal {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                temp.add(node.val);

                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);

            }
            result.add(0,temp);

        }

        return result;


    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left =new TreeNode(13);
        root.left.right =new TreeNode(15);
        root.right =new TreeNode(7);
        root.right.right =new TreeNode(10);
        System.out.println(levelOrderBottom(root).toString());
    }

}
