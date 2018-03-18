package QueueIMP;

/**
 * Created by roshni on 6/7/16.
 */
public class QueueAsLInked implements Queue{
    /**
     * An object of type Node holds one of the items
     * in the linked list that represents the queue.
     */
    private static class Node {
        int item;
        Node next;
    }

    private Node head = null;  // Points to first Node in the queue.
    // The queue is empty when head is null.

    private Node tail = null;  // Points to last Node in the queue.

    /**
     * Add N to the back of the queue.
     */
    @Override
	public void enqueue( int N ) {
        Node newTail = new Node();  // A Node to hold the new item.
        newTail.item = N;
        if (head == null) {
            // The queue was empty.  The new Node becomes
            // the only node in the list.  Since it is both
            // the first and last node, both head and tail
            // point to it.
            head = newTail;
            tail = newTail;
        }
        else {
            // The new node becomes the new tail of the list.
            // (The head of the list is unaffected.)
            tail.next = newTail;
            tail = newTail;
        }
    }


    /**
     * Remove and return the front item in the queue.
     * Throws an IllegalStateException if the queue is empty.
     */
    @Override
	public int dequeue() {
        if ( head == null)
            throw new IllegalStateException("Can't dequeue from an empty queue.");
        int firstItem = head.item;
        head = head.next;  // The previous second item is now first.
        // If we have just removed the last item,
        // then head is null.
        if (head == null) {
            // The queue has become empty.  The Node that was
            // deleted was the tail as well as the head of the
            // list, so now there is no tail.  (Actually, the
            // class would work fine without this step.)
            tail = null;
        }
        return firstItem;
    }

    @Override
    public int peek() {
        return head.item;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    /**
     * Return true if the queue is empty.
     */

    public static void main(String[] args){
     Queue q=new QueueAsLInked();
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        System.out.println(q.size());
        q.dequeue();
        q.peek();
    }
}
