package LeetCode;

import PracticeQstns.ReverseLinkedList;

public class SwapNodesInpairs {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // prints content of double linked list
    static  void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static Node swapPairs(Node head){
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow =  dummy;

        while(fast.next!=null && fast.next.next!=null){
            Node prev = fast;

            fast = fast.next;
            slow =  fast;
            fast = fast.next;


            Node after = fast.next;
            slow.next = after;
            fast.next = slow;
            prev.next = fast;


            fast = slow;



        }

        return dummy;
    }


    public static void main(String[] args) {
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        swapPairs(head);
        printList(head);


    }


}
