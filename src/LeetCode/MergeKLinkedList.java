package LeetCode;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.PriorityQueue;

public class MergeKLinkedList {
    public static ListNode mergeKLists(ListNode[] lists) {

        if(lists==null || lists.length==0)return null;
        ListNode head =  new ListNode(0);
        ListNode point = head;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(ListNode list:lists){
            while(list!=null){
                pq.add(list.val);
                list = list.next;
            }
        }

        while(!pq.isEmpty()){
            point.next = new ListNode(pq.poll());
            point=point.next;
        }
        return head.next;

    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next =new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(5);
        l2.next.next =new ListNode(7);

        ListNode l3 = new ListNode(0);
        l3.next=new ListNode(3);
        l3.next.next =new ListNode(8);

        ListNode[] lists = new ListNode[]{l1,l2,l3};

        ListNode result = mergeKLists(lists);

        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }

    }
}
