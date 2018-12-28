package LeetCode;

public class BoundaryTraversalOfBinaryTree {

    public static void main(String[] args){
        TreeNode root =new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(2);
        root.left.right.left = new TreeNode(6);
        root.right = new TreeNode(11);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(18);
        root.right.left.left = new TreeNode(12);
        root.right.right.left = new TreeNode(16);
        boundaryTraversal(root);

    }

    public static void boundaryTraversal(TreeNode root){
        leftBoundaryTraversal(root);
        rightBoundaryTraversal(root.right);
        leafNodeTraversal(root);
    }

    public static void leftBoundaryTraversal(TreeNode root) {
            if(root==null) return;

            if(root.left!=null){
                System.out.println(root.val);
                leftBoundaryTraversal(root.left);
            }
            else if(root.right!=null){
                System.out.println(root.val);
                leftBoundaryTraversal(root.right);
            }


    }
    public static void rightBoundaryTraversal(TreeNode root) {
            if(root==null) return;


            if(root.right!=null){
                System.out.println(root.val);
                leftBoundaryTraversal(root.right);
            }
            else if(root.left!=null){
                System.out.println(root.val);
                leftBoundaryTraversal(root.left);
            }


    }

    public static void leafNodeTraversal(TreeNode root){
        if(root==null)return;
        leafNodeTraversal(root.left);
        if(root.left==null&&root.right==null){
            System.out.println(root.val);
        }
        leafNodeTraversal(root.right);
    }
}
