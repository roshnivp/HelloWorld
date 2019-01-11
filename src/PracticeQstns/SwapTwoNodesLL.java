package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 17/03/18.
 */
public class SwapTwoNodesLL {

    ListNode pX, pY, pXprev, pYprev,head = null;
    public static void main(String[] args){
        ListNode node= new ListNode(5);
        node.next = new ListNode(1);
        node.next.next = new ListNode(7);
        node.next.next.next= new ListNode(2);
        node.next.next.next.next = new ListNode(4);
        SwapTwoNodesLL swap = new SwapTwoNodesLL();
        swap.searchElements(1,2,node);
        System.out.println();

    }

     void searchElements(int x, int y, ListNode head){
         ListNode p = head;
         ListNode prev = null;


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

    void swapElements(ListNode pX, ListNode pXprev, ListNode pY, ListNode pYprev){

        ListNode temp = null;
        temp = pY.next;
        pY.next = pX.next;
        pX.next = temp;

        if(pXprev ==null){
            pY = head;
        }

        if(pYprev ==null){
            pX = head;
        }
        pXprev.next = pY;
        pYprev.next = pX;



    }


}
