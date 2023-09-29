/**
 * MyQueue class represents a generic queue data structure using an array.
 * The queue follows the FIFO (First In, First Out) principle.
 *
 * @param <E> The type of elements to be stored in the queue
 * @author Joshua Zhang
 * @version 9/27/23
 */
public class MyQueue<E> {
    private E[] queue;
    private int back;
    private int front;
    private int size;

    /**
     * Constructs a new Queue with a size of 100
     * 
     */
    public MyQueue() {
        queue = (E[]) new Object[100];
        size = 0;
        back = 0;
        front = 0;
    }

    /**
     * Enqueues an element into the queue
     *
     * @param element The element to be added to the queue
     * @throws IndexOutOfBoundsException if the queue is full
     */
    public void enqueue(E element) throws IndexOutOfBoundsException {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        queue[back] = element;
        back++;
        size++;
    }

    /**
     * Dequeues an element from the queue.
     *
     * @return The dequeued element.
     * @throws IndexOutOfBoundsException if the queue is empty 
     */
    public E dequeue() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        E element = queue[front];
        queue[front] = null;
        front++;
        size--;
        return element;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Shows the number at the front of the queue
     *
     * @return The element at the front of the queue.
     * @throws IndexOutOfBoundsException if the queue is empty.
     */
    public E front() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return queue[front];
    }

    /**
     * Returns the size of the queue.
     *
     * @return The size of the queue.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is full
     *
     * @return True if the queue is full, false otherwise
     */
    public boolean isFull() {
        return (size() >= queue.length);
    }

    /**
     * Converts the queue to a String list of the numbers within the queue
     *
     * @return A string with commas seperating each number in the stack 
     */
    public String toString() {
        String queueString = "";

        for (int i = front; i < back; i++) {
            queueString += queue[i];
            if (i < back - 1) {
                queueString += ", ";
            }
        }

        return queueString;
    }
}
