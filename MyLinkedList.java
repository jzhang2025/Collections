import java.util.NoSuchElementException;

/**
 * Creates a Linked List data structure that can organize integers in nodes.
 * The code can add nodes to front, back, and also remove nodes from the front.
 * 
 * 
 * @author Joshua Zhang
 * @version 1.0
 *
 * @param <E> The type of elements held in the linked list.
 */
public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    /**
     * Constructs an empty linked list.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Adds a new element at the head of the linked list.
     *
     * @param element The element to add.
     */
    public void addHead(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    /**
     * Removes and returns the element at the head of the linked list.
     *
     * @return The element at the head of the linked list.
     * @throws NoSuchElementException if the linked list is empty.
     */
    public E removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            Node<E> temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
            return temp.getData();
        }
    }

    /**
     * Gets the element at the head of the linked list without removing it.
     *
     * @return The element at the head of the linked list.
     * @throws NoSuchElementException if the linked list is empty.
     */
    public E getHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            return head.getData();
        }
    }

    /**
     * Returns the number of elements in the linked list.
     *
     * @return The number of elements in the linked list.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return True if the linked list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Adds a new element at the tail of the linked list.
     *
     * @param element The element to add.
     */
    public void addTail(E element) {
        Node<E> newNode = new Node<>(element);
        Node<E> temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    /**
     * Returns a string representation of the linked list.
     *
     * @return A string representing the elements of the linked list.
     */
    public String toString() {
        String listString = "";
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            listString += temp.getData();
            temp = temp.getNext();
            if (i < size - 1) {
                listString += ", ";
            }
        }
        return listString;
    }
}
