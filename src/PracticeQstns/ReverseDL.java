package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 16/01/18.
 */
public class ReverseDL {
     public static DLNode reverseDL(DLNode root){
         if(root == null) return null;
         if(root.next ==null) return root;
         DLNode current = root;
         DLNode temp =null;
         while(current != null){
             //swap between the prev and next nodes
             temp = current.prev;
             current.prev = current.next;
             current.next = temp;
             current = current.prev;
         }
         if(temp != null) temp = temp.prev;
         return temp;
     }

}
class DLNode{
    int val;
    DLNode next = null;
    DLNode prev = null;
    DLNode(int val){
        this.val = val;
    }

}