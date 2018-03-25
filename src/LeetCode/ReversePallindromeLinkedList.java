package LeetCode;

import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class ReversePallindromeLinkedList {
    static Node reverseLL(Node head){
        if(head==null) return null;
        Node current = head;
        Node prev= null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = prev;
        return current;
    }

    static void reverseDL(DLNode head){
        if(head==null) return ;
        DLNode current = head;
        DLNode temp = null;
        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }

    }
    static boolean isPallindrome(Node head){
        if(head==null) return true;
        Node slow = head;
        Node fast = head;
        Stack<Node> st = new Stack<>();
       // st.push(slow);

        while(fast!=null && fast.next!=null){
            st.push(slow);
            slow= slow.next;
            fast = fast.next.next;

        }
        if(fast!= null){
            slow = slow.next;
        }

        while (!st.isEmpty() && slow!=null)
        {
            if( st.pop().val !=slow.val){
                return false;
            }
            slow =slow.next;
        }
        return true;
    }
    public static void main(String[] args){
        Node node= new Node(5);
        node.next = new Node(1);
        node.next.next = new Node(7);
        node.next.next.next= new Node(7);
        node.next.next.next.next = new Node(1);
        node.next.next.next.next.next = new Node(5);
//        Node root =reverseLL(node);
//        while(root!=null){
//            System.out.println(root.val);
//            root = root.next;
//        }

        System.out.println(isPallindrome(node));
        DLNode node1 = new DLNode(5);
        node1.next = new DLNode(1);
        node1.next.prev = node1;
        node1.next.next = new DLNode(7);
        node1.next.next.prev = node1.next;

       reverseDL(node1);
        while(node1!=null){
            System.out.println(node1.val);
            node1 = node1.next;
        }

    }
}
class DLNode{
    int val;
    DLNode prev = null;
    DLNode next = null;
    DLNode(int val){
        this.val = val;
    }
}