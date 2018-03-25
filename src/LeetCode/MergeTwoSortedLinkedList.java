package LeetCode;


/**
 * Created by Roshni Velluva Puthanidam on 08/12/17.
 */
public class MergeTwoSortedLinkedList {

    public Node merge(Node p, Node q){
        if(p== null && q== null) return null;
        if(p== null) return q;
        if(q== null) return p;
        Node dummy= new Node(0);
        Node s= dummy;
        while(p !=null && q!=null){
            int x= p.val ;
            int y= q.val ;
            if(x < y){
                s.next = p;
                p = p.next;
            }
            else{
                s.next = q;
                q = q.next;
            }
            s= s.next;
        }
        while(p != null ){
            s.next = p;
            s = s.next;
            p = p.next;
        }

        while(q!= null){
            s.next = q;
            s= s.next;
            q= q.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        MergeTwoSortedLinkedList ml = new MergeTwoSortedLinkedList();
        Node p =new Node(2);
        p.next = new Node(4);
        p.next.next = new Node(6);
        p.next.next.next = new Node(7);
        Node q= new Node(1);
        q.next = new Node(3);
        q.next.next = new Node(8);
        Node res =ml.merge(p,q);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
