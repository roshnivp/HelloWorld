package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindModeInBST {
    public static void main(String[] args){
        TreeNode node = new TreeNode(5);
        node.left=new TreeNode(5);
        node.right= new TreeNode(3);
        node.left.left=new TreeNode(3);
        System.out.println(modesOfBST(node).toString());
    }
    static HashMap<Integer,Integer> map = new HashMap<>();
    static int mode=0;
    static List<Integer> ls = new ArrayList<>();
    public static List<Integer> modesOfBST(TreeNode node){
        if(node==null)return ls;
        inOrder(node);
       ;
        for(int key:map.keySet()){
            if(map.get(key)==mode){
                ls.add(key);
            }
        }
        return ls;
    }
    public static void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        int count = map.getOrDefault(root.val,0)+1;
        map.put(root.val,count);
        if(mode<count)mode=count;
        inOrder(root.right);

    }
}
