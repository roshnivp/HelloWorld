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
    static boolean isPallindrome(Node head){
        if(head==null) return true;
        Node slow= head;
        Node fast= head;
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
    }
}
