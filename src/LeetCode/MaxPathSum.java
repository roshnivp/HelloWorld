package LeetCode;

public class MaxPathSum {
    int maxValue=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxSum(root);
        return maxValue;
    }

    int maxSum(TreeNode root){

        if(root == null) return 0;

        int left = maxSum(root.left);
        int right = maxSum(root.right);
        int maxTotal = left + right + root.val;
        int maxSingle = Math.max(left, right) + root.val;

        int res = Math.max(maxTotal, maxSingle);
        res = Math.max(root.val, res);
        maxValue = Math.max(maxValue, res); //global variable keep track of the max path sum so far
        return Math.max(maxSingle, root.val);// -- maxsum from the current node(current node to leaf)

    }
    public static void main(String[] args){
        MaxPathSum mp = new MaxPathSum();
        TreeNode node = new TreeNode(-10);
        node.left= new TreeNode(9);
        node.left.left= new TreeNode(19);
        node.right = new TreeNode(20);
        node.right.left=new TreeNode(15);
        node.right.right= new TreeNode(7);
        System.out.println(mp.maxPathSum(node));
    }
}
