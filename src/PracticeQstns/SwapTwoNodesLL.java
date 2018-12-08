package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 17/03/18.
 */
public class SwapTwoNodesLL {

     Node pX, pY, pXprev, pYprev,head = null;
    public static void main(String[] args){
        Node node= new Node(5);
        node.next = new Node(1);
        node.next.next = new Node(7);
        node.next.next.next= new Node(2);
        node.next.next.next.next = new Node(4);
        SwapTwoNodesLL swap = new SwapTwoNodesLL();
        swap.searchElements(1,2,node);
        System.out.println();

    }

     void searchElements(int x, int y, Node head){
        Node p = head;
        Node prev = null;


        while(p!=null && p.data!=x){
            prev = p;
            p = p.next;
        }

        pXprev = prev;
         pX = p;

         while(p!=null && p.data!=y){
             prev = p;
             p = p.next;
         }
         pYprev = prev;
         pY = p;

         swapElements(pX,pXprev,pY,pYprev);
         while(head!=null){
             System.out.println(head.data);
             head = head.next;
         }

    }

    void swapElements(Node pX, Node pXprev, Node pY, Node pYprev){

        Node temp = null;
        temp = pY.next;
        pY.next = pX.next;
        pX.next = temp;

        if(pXprev ==null){
            pY = head;
            pYprev.next = pX;
        }

        if(pYprev ==null){
            pX = head;
            pXprev.next = pY;
        }

        if(pXprev !=null && pYprev !=null ){
            pXprev.next = pY;
            pYprev.next = pX;
        }


    }


}
