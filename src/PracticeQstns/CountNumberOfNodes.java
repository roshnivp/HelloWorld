package PracticeQstns;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Roshni Velluva Puthanidam on 30/03/18.
 */
public class CountNumberOfNodes {
    public static void main(String args[]) {

        Tree_Node root = new Tree_Node(10);
        root.left = new Tree_Node(8);
        root.right = new Tree_Node(2);
        root.left.left = new Tree_Node(3);
        root.left.right = new Tree_Node(5);
        root.right.left = new Tree_Node(2);
        int count = getNumberofNodes(root);
        System.out.print(count);
    }
    static int getNumberofNodes(Tree_Node root){
        if(root==null){
            return 0;
        }
        Queue<Tree_Node> queue = new LinkedList<>();
        queue.add(root);
        int count =0;

        while(!queue.isEmpty()){
            Tree_Node node = queue.poll();
            count++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return count;
    }


}
