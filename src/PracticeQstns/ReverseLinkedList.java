package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 16/02/17.
 */
public class ReverseLinkedList {


        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        /* Function to reverse the linked list */
        Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }


        // prints content of double linked list
        void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            ReverseLinkedList list = new ReverseLinkedList();
            head = new Node(85);
            head.next = new Node(15);
            head.next.next = new Node(4);
            head.next.next.next = new Node(20);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(6);
            head.next.next.next.next.next.next = new Node(7);
            head.next.next.next.next.next.next.next = new Node(8);

            System.out.println("Given Linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }



}
