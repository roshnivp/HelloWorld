package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 08/12/17.
 */
public class SplitLinkedList {

    public Node splitInHalf(Node root){
           if(root==null) return null;

           Node slow_ptr = root;
           Node fast_ptr = root;

           while(fast_ptr!=null && fast_ptr.next!=null){
               fast_ptr = fast_ptr.next.next;
               slow_ptr = slow_ptr.next;

           }

           Node toReturn = slow_ptr.next;
           slow_ptr.next = null;

           return toReturn;

    }
}
class Node{
    int val;
    Node next =null;
    Node(int val){
        this.val = val;
    }
}