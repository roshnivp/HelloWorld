package PracticeQstns;

import java.security.PublicKey;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class SortLinkedList {
    static void sortLinkedList(ListNode root){
        if(root==null) return;
        ListNode i= root;

        while(i!= null){
            ListNode j= i.next;
            while(j!= null){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data= j.data;
                    j.data = temp;

                }
                j= j.next;
            }
            i= i.next;
        }
        while(root!=null){
            System.out.println(root.data);
            root = root.next;
        }
    }

    public static void main(String[] args){
        ListNode node= new ListNode(5);
        node.next = new ListNode(1);
        node.next.next = new ListNode(7);
        node.next.next.next= new ListNode(2);
        node.next.next.next.next = new ListNode(4);
        sortLinkedList(node);
    }
}
