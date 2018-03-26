package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 26/02/18.
 */
public class PriorityQueue {
    // Implements a priority queue using a max heap. The heap is of fixed size and
// represented using an array.

        int[] heap;
        int size;

        // Constructor initializes instance variables
        public PriorityQueue(int maxSize) {
            heap = new int[maxSize];
            size = 0;
        }

        // Push an element on to the queue
        public void push(int val) {
            // If the queue is full then throw an exception
            if (size == heap.length) throw new IllegalStateException();

            // Put the value in the next available space in the queue
            int pos = size;
            heap[pos] = val;

            // While val is bigger than its parent, swap it with its parent
            while (pos > 0) {
                // Get the parent and compare the values
                int parent = (pos+1) / 2 - 1;
                if (heap[parent] > heap[pos]) break;
                swapIndices(parent, pos);
                pos = parent;
            }

            // We added an element so increment the size
            size++;
        }

        // Pop the max element from the queue
        public int pop() {
            // If the queue is empty, throw an exception
            if (size == 0) throw new IllegalStateException ();

            // The top of the heap is the first item in the array, so save it off
            // to the side so we don't lose it
            int toReturn = heap[0];

            // Move the bottom item in the heap to the first position. We don't need
            // to remove it from the array because we have the size variable
            heap[0] = heap[size - 1];
            size--;

            // Bubble down the top element to the right spot
            int pos = 0;
            // We're going to be swapping with the children and any pos >= size / 2
            // doesn't have any children
            while (pos < size / 2) {
                int leftChild = pos * 2 + 1;
                int rightChild = leftChild + 1;
                // If the right child exists and is greater than the left child,
                // compare it to the current position
                if (rightChild < size && heap[leftChild] < heap[rightChild]) { // Only swap if the value is less than the child if (heap[pos] >= heap[rightChild]) break;
                    swapIndices(pos, rightChild);
                    pos = rightChild;
                } else {
                    // Do the same comparison with the left child
                    if (heap[pos] >= heap[leftChild]) break;
                    swapIndices(pos, leftChild);
                    pos = leftChild;
                }
            }

            return toReturn;
        }

        // Swap the values at the indices
        private void swapIndices(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public static void main(String[] args){
            PriorityQueue pq= new PriorityQueue(10);
            pq.push(5);
            pq.push(10);
            pq.push(2);
            pq.push(8);
            pq.push(9);
            pq.push(6);
            pq.push(3);
            pq.push(4);
            pq.push(1);
            System.out.print(pq.pop());
            System.out.print(pq.pop());
        }

}
