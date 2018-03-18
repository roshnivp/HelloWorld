package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Roshni Velluva Puthanidam on 29/11/17.
 */
public class BottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        TreeNode node =null;

        q.add(root);

        while(!q.isEmpty()){
            node = q.poll();
            if(node.right!=null) q.add(node.right);
            if(node.left!=null) q.add(node.left);
        }
        return node.val;
    }
}
