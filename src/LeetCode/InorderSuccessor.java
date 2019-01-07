package LeetCode;



public class InorderSuccessor {

    public static void main(String[] args){
        InorderSuccessor in = new InorderSuccessor();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(6);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(7);
        root.right.right = new TreeNode(16);
        root.right.left = new TreeNode(12);

        int ans= in.inorderSuccessor(root,4);
        System.out.print(ans);

    }

    int store= 0;
    public int inorderSuccessor(TreeNode root, int target){
          if(root==null) return 0;


          while(target!=root.val){
            if(target<root.val){
                store = root.val;
                root=root.left;

            }

            else if(target>root.val){
                root=root.right;
            }
        }

        TreeNode inSucc = root;
        if(inSucc.right!=null){
            TreeNode temp = inSucc.right;

            while(temp.left!=null){
                temp= temp.left;
            }
            return temp.val;

        }
        else {
            return store;
        }




    }

}
