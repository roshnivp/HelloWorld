package LeetCode;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 08/12/17.
 */
public class VerticalOrderTravelBST {
    Map<Integer,List<Integer>> map = new HashMap<>();

    public  void verticalTraversal(TreeNode root){
        if(root==null) return ;
        int hd = 0;
        updateHashMap(root,hd);
        for(Map.Entry<Integer,List<Integer>> hm:map.entrySet()){
            System.out.println(hm.getValue().toString());
        }
    }

    public void updateHashMap(TreeNode node,int hd){
         if(node == null) return;
         List<Integer> ls = map.get(hd);

         if(ls == null){
             ls= new ArrayList<>();
             ls.add(node.val);
             map.put(hd,ls);
         }
         else{
             ls.add(node.val);
              map.put(hd,ls);
         }
         updateHashMap(node.left, hd-1);
         updateHashMap(node.right,hd+1);
    }

    public static void main(String[] args){
        VerticalOrderTravelBST bst = new VerticalOrderTravelBST();
        TreeNode node = new TreeNode(8);
        node.left=new TreeNode(5);
        node.left.right = new TreeNode(6);
        node.left.left = new TreeNode(4);
        node.left.right.right = new TreeNode(7);
        node.right=new TreeNode(10);
        node.right.right = new TreeNode(12);
        node.right.left = new TreeNode(9);
        bst.verticalTraversal(node);
    }

}
