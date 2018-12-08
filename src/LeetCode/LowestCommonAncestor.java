package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 23/09/17.
 */
/**
 * Definition for a binary tree node.*/

class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,  p,  q);
        TreeNode right = lowestCommonAncestor(root.right,  p,  q);

        if(left !=null && right !=null){
            return root;
        }

        return left!=null? left:right;

    }

    public static void main(String[] args){
        LowestCommonAncestor lca = new LowestCommonAncestor();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(6);
        root.left.right= new TreeNode(4);
        root.right.left = new TreeNode(18);
        root.right.left = new TreeNode(20);

        lca.lowestCommonAncestor(root,root.right,root.left.right);

    }
}