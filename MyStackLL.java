/**
 * MyStackLL is a generic stack implementation using a linked list.
 *
 * @author Joshua Zhang
 * @version 10/6/23
 */
public class MyStackLL<E>
{
    private MyLinkedList<E> stack; 
    private int size; 

    /**
     * Initializes an empty stack.
     */
    public MyStackLL()
    {
        stack = new MyLinkedList<>();
        size = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element The element to be pushed on the stack
     */
    public void push(E element) {
        stack.addHead(element);
        size++;
    }

    /**
     * Pops an element from the top of the stack.
     *
     * @return The element popped from the stack.
     */
    public E pop() {
        size--;
        return stack.removeHead();
    }

    /**
     * Retrieves the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack.
     */
    public E top() {
        return stack.getHead();
    }

    /**
     * Returns the number of elements in the stack
     *
     * @return The size of the stack.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return True if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Checks if the stack is full (Will never be full because a Linked List
     * is dynamic).
     *
     * @return Always returns false for a linked list-based stack.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Creates a list of all the numbers in the stack top to bottom
     *
     * @return A string representing the elements in the stack.
     */
    public String toString() {
        return stack.toString();
    }
}
