package PracticeQstns;

import java.security.PublicKey;

/**
 * Created by Roshni Velluva Puthanidam on 09/12/17.
 */
public class SortLinkedList {
    static void sortLinkedList(Node root){
        if(root==null) return;
        Node i= root;

        while(i!= null){
            Node j= i.next;
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
        Node node= new Node(5);
        node.next = new Node(1);
        node.next.next = new Node(7);
        node.next.next.next= new Node(2);
        node.next.next.next.next = new Node(4);
        sortLinkedList(node);
    }
}
