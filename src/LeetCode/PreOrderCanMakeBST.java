package LeetCode;

import java.util.Stack;

public class PreOrderCanMakeBST {

    public static void main(String args[]) {
        PreOrderCanMakeBST bst = new PreOrderCanMakeBST();
        int[] pre1 = new int[]{40, 30, 35, 80, 100};
        int n = pre1.length;

        System.out.println(bst.canRepresentBST(pre1, n));

        int[] pre2 = new int[]{40, 30, 35, 20, 80, 100};
        int n1 = pre2.length;

        System.out.println(bst.canRepresentBST(pre2, n));

    }

    public boolean canRepresentBST(int[] preorder,int n){
        int min = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(preorder[i]<min)return false;
            while(!st.isEmpty() && st.peek()<preorder[i]){
                min = st.pop();
            }
            st.push(preorder[i]);

        }

        return true;
    }
}
