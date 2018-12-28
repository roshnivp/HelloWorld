package LeetCode;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ReverseBWLS {
    public ListNode reverseBetween(ListNode head, int m, int n) {


        ListNode node = head;
        ListNode rev = null;
        ListNode rev_prev = null;
        ListNode revEnd = null;
        ListNode revEnd_next = null;
        int i=1;
        while(node!=null && i<=n){
            if(i<m){
                rev_prev=node;
            }
            if(i==m){
                rev=node;
            }
            if(i==n){
                revEnd=node;
                revEnd_next=node.next;
            }
            node=node.next;
            i++;
        }
        revEnd.next=null;

        revEnd = reverse(rev);
        if(rev_prev!=null){
            rev_prev.next=revEnd;
        }
        else{
            head=revEnd;
        }
        rev.next = revEnd_next;
        return head;

    }

    ListNode reverse(ListNode current){
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String[] args){
        ReverseBWLS rb = new ReverseBWLS();
        ListNode root = new ListNode(5);
        root.next= new ListNode(7);
        root.next.next= new ListNode(10);
        root.next.next.next= new ListNode(3);
        root.next.next.next.next= new ListNode(5);
        root.next.next.next.next.next= new ListNode(12);
        root.next.next.next.next.next.next=null;
        ListNode node =rb.reverseBetween(root,2,4);

        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
