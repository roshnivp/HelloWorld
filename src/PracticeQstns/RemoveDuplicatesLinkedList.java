package PracticeQstns;

import java.util.HashSet;

/**
 * Created by Roshni Velluva Puthanidam on 12/11/17.
 */
public class RemoveDuplicatesLinkedList {
    public void removeDuplicates(ListNode node){
        ListNode prev=null;
        if(node==null) return;
        HashSet<Integer> nodes = new HashSet<>();

        while(node!=null){
            if(nodes.contains(node.data)){
                prev.next= node.next;
            }
            else{
                nodes.add(node.data);
                prev = node;
            }
            node = node.next;
        }
    }
    public static void main(String args[])
    {
        RemoveDuplicatesLinkedList Rlist = new RemoveDuplicatesLinkedList();

        ListNode node = new ListNode(5);
        node.next = new ListNode(6);
        node.next.next = new ListNode(7);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(8);
        Rlist.removeDuplicates(node);


    }

}
class ListNode
{
    int data;
    ListNode next;
    ListNode(int d) {data = d; next = null; }
}