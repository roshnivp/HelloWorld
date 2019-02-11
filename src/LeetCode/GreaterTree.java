package LeetCode;

public class GreaterTree {

    int valueToBeAdded=0;
    public TreeNode convertBST(TreeNode root) {
         if(root==null) return root;
         convertBST(root.right);
         valueToBeAdded+=root.val;
         root.val= valueToBeAdded;
         convertBST(root.left);
         return root;
    }

    public static void main(String[] args){
        GreaterTree gt = new GreaterTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.left.left = new TreeNode(11);
        root.right.right = new TreeNode(17);
        gt.convertBST(root);



    }
}
