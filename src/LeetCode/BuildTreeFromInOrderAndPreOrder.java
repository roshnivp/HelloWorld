package LeetCode;


import java.util.Arrays;
import java.util.HashMap;

public class BuildTreeFromInOrderAndPreOrder {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i=0; i<inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, inMap);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder, int preL, int preR, int inL, int inR, HashMap<Integer, Integer> inMap) {
        if (!(preL <= preR && inL <= inR && preorder != null && inorder != null
                && preorder.length != 0 && inorder.length != 0)) return null;

        TreeNode root = new TreeNode(preorder[preL]);

        int inL_R = inMap.get(root.val) - 1;
        int leftTreeSize = inMap.get(root.val) - inL;
        int preL_R = preL + leftTreeSize;

        root.left = buildTree(preorder, inorder, preL+1, preL_R, inL, inL_R, inMap);
        root.right = buildTree(preorder, inorder, preL_R+1, preR, inL_R+2, inR, inMap);

        return root;
    }
    public static void main(String[] args){
        int[] preorder =new int[]{3,9,20,15,7};
        int[] inorder= new int[]{9,3,15,20,7};
        TreeNode root  = buildTree(preorder,inorder);
        System.out.println(root.val);
    }


}
