package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Roshni Velluva Puthanidam on 29/11/17.
 */
public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            double sum=0.0;

            for(int i=0; i<size; i++){
                TreeNode node= q.poll();
                sum +=node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            result.add(sum/size);
        }

        return result;
    }
}
