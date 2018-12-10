package LeetCode;

public class RemoveNthNodeFromEnd {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    static  class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val)
        {
            this.val = val;
        }
    }

    // prints content of double linked list
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(85);
        head.next = new ListNode(15);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(20);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        removeNthFromEnd(head,2);
        printList(head);
    }
}
