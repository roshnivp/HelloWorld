package LeetCode;

public class CountNodeInCompleteTree {

    public static void main(String[] args){

        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(10);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(8);
        System.out.println(countNodes(node));
    }

    public static int countNodes(TreeNode root){
        if(root==null)return 0;

        int height=1;
        TreeNode left = root.left;
        TreeNode right = root.right;

        while(left!=null && right!=null){
            height++;
            left =left.left;
            right=right.right;
        }

        if(right==null && left==null){
            return (1<<height)-1; //no of nodes in a complete tree 2^h-1
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
