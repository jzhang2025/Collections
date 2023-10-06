/**
 * MyQueueLL class represents a generic queue data structure 
 * using a linked list.
 *
 * @author Joshua Zhang
 * @version 10/6/23
 */
public class MyQueueLL<E> {
    private MyLinkedList<E> queue;
    private int size;

    /**
     * Constructs a new Queue.
     */
    public MyQueueLL() {
        queue = new MyLinkedList<>();
        size = 0;
    }

    /**
     * Enqueues an element into the queue.
     *
     * @param element The element to be added to the queue.
     */
    public void enqueue(E element) {
        queue.addTail(element);
        size++;
    }

    /**
     * Dequeues an element from the queue.
     *
     * @return The dequeued element.
     * @throws IndexOutOfBoundsException if the queue is empty.
     */
    public E dequeue() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        size--;
        return queue.removeHead();
    }

    /**
     * Shows the element at the front of the queue.
     *
     * @return The element at the front of the queue.
     * @throws IndexOutOfBoundsException if the queue is empty.
     */
    public E front() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return queue.getHead();
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The size of the queue.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Creates a string list with all the elements in the queue front to back
     *
     * @return A string with commas separating each element in the queue.
     */
    public String toString() {
        return queue.toString();
    }
}
