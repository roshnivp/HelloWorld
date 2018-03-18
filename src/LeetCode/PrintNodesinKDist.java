package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class PrintNodesinKDist {

    static void nodeInKDist(TreeNode root, int k){

        if(root==null) return;

        if(k==0)  System.out.println(root.val);
        else{
            nodeInKDist(root.left, k-1);
            nodeInKDist(root.right, k-1);

        }
        //return 0;
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(8);
        node.left = new TreeNode(6);
        node.right = new TreeNode(14);
        node.left.left = new TreeNode(4);
        node.left.left.left = new TreeNode(2);
        node.right = new TreeNode(14);
        node.right.left = new TreeNode(10);
        nodeInKDist(node,2);



    }
}
