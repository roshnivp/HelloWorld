package LeetCode;


public class InorderPredecessor {
    public static void main(String[] args){
        InorderPredecessor in = new InorderPredecessor();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(6);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(7);
        root.right.right = new TreeNode(16);
        root.right.left = new TreeNode(12);

        int ans= in.inorderPredecessor(root,7);
        System.out.print(ans);

    }
    int store =0;
    public int inorderPredecessor(TreeNode root, int target){
        if(root==null) return 0;

        while(target!=root.val){
            if(target<root.val){
                root=root.left;
            }
            else if(target>root.val){
                store=root.val;
                root=root.right;
            }

        }
        TreeNode inPred = root;
        if(inPred.left!=null){
            TreeNode temp = inPred.left;

            while(temp.right!=null){
                temp= temp.right;

            }
            return temp.val;
        }

        else {
                return store;

        }




    }
}
