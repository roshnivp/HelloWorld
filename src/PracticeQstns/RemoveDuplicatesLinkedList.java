package PracticeQstns;

import java.util.HashSet;

/**
 * Created by Roshni Velluva Puthanidam on 12/11/17.
 */
public class RemoveDuplicatesLinkedList {
    public void removeDuplicates(Node node){
        Node prev=null;
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

        Node node = new Node(5);
        node.next = new Node(6);
        node.next.next = new Node(7);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(8);
        Rlist.removeDuplicates(node);


    }

}
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}