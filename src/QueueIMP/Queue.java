package QueueIMP; /**
 * Created by roshni on 6/14/16.
 */

/**
 * A small queue interface.  You can query the size of the queue and
 * ask whether it is empty, add and remove items, and peek at the front
 * item.
 */
public interface Queue {

    /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(int item);

    /**
     * Removes the front item from the queue and returns it.
     *
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    int dequeue();

    /**
     * Returns the front item from the queue without popping it.
     *
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    int peek();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}