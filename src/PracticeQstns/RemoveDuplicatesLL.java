package PracticeQstns;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roshni Velluva Puthanidam on 28/02/18.
 */
public class RemoveDuplicatesLL {
    ListNode head;
    /* Inserts a new Node at front of the list. */

    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    /* Drier program to test above functions */
    public static void main(String args[])
    {
        RemoveDuplicatesLL llist = new RemoveDuplicatesLL();

        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.push(5);
        llist.push(8);
        llist.push(8);
        llist.push(8);
        llist.push(8);



        /*Create loop for testing */
      //  llist.head.next.next.next.next = llist.head;

        ListNode temp =llist.removeDuplicates();
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       // System.out.print(llist.toString());
    }

    ListNode removeDuplicatesFromSortedLL(){

        ListNode p =head;
        ListNode temp =head;

        while(p!=null && p.next!=null){
            if(p.data!=p.next.data){
                p = p.next;
            }
            else{
                p.next = p.next.next;
            }
        }
        return head;


    }
    ListNode removeDuplicates(){
        Set<Integer> hashSet= new HashSet<>();
        ListNode temp = head;
        ListNode prev=null;

        while(temp!=null && temp.next!=null){
            if(!hashSet.contains(temp.data)){
                hashSet.add(temp.data);
                prev = temp;
                temp = temp.next;
            }
            else{
                prev.next = temp.next;
                temp = prev.next;
            }

        }
        return head;

    }
}
