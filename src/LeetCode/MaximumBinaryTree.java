package LeetCode;

import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 18/10/17.
 */
public class MaximumBinaryTree {
    static TreeNode constructMaximumBinaryTree(int[] nums) {

        int n= nums.length;
        int max = nums[0];
        int index = 0;

        TreeNode node= new TreeNode(0);
        if(n==0)  return null;

        if(n==1){
            node.val = max;
            return node;
        }

        for(int i=1; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
                index= i;
            }

        }

        node.val = max;
        if(index >=1)
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        if(index<n-1)
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, n));


        return node;


    }

    public static void main(String[] args){
        int[] arr = new int[]{3,2,1,6,0,5};
        constructMaximumBinaryTree(arr);
    }
}

