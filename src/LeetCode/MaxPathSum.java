package LeetCode;

public class MaxPathSum {
    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue=Integer.MIN_VALUE;
        maxSum(root);
        return maxValue;
    }

    int maxSum(TreeNode node){

        if(node==null) return 0;

        int left =  Math.max(0,maxSum(node.left));

        int right = Math.max(0,maxSum(node.right));

        maxValue = Math.max(maxValue, left+right+node.val);

        return Math.max(left,right)+node.val;



    }
    public static void main(String[] args){
        MaxPathSum mp = new MaxPathSum();
        TreeNode node = new TreeNode(-10);
        node.left= new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left=new TreeNode(15);
        node.right.right= new TreeNode(7);
        System.out.println(mp.maxPathSum(node));
    }
}
