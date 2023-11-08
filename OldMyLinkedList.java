import java.util.NoSuchElementException;

/**
 * Creates a Linked List data structure that can organize integers in nodes.
 * The code can add nodes to front, back, and also remove nodes from the front.
 * 
 * @author Joshua Zhang
 * @version 11/1/23
 */
public class OldMyLinkedList<E extends Comparable<E>>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Constructs a new empty LinkedList
     */
    public OldMyLinkedList() {
        head = null;
        tail = null;
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
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    /**
     * Adds a new element at the tail of the linked list.
     *
     * @param element The element to add.
     */
    public void addTail(E element) {
        
        if (head == null) {
            addHead(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            tail.setNext(newNode);
            tail = newNode; 
            size++;
        }
    }
    
    /**
     * Inserts an element at the specified index in the list.
     *
     * @param index The index at which to insert the element.
     * @param element The element to insert.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public void add(int index, E element) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        }
    
        if (index == 0) {
            addHead(element);
        } else if (index == size) {
            addTail(element);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node<E> newNode = new Node<E>(element);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    
        
    }

    /**
     * Adds an element to the end of the list.
     *
     * @param element The element to add to the list.
     */
    public void add(E element) {
        addTail(element);
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
     * Removes and returns the element at the specified index in the list.
     *
     * @param index The index of the element to remove.
     * @return The removed element.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public E remove(int index) throws NoSuchElementException {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        if (index == 0) {
            return removeHead();        
        } else {
            Node<E> pointer = head;
            Node<E> removedNode;
            for (int i = 0; i < index - 1; i++) {
                pointer = pointer.getNext();
            }
            removedNode = pointer.getNext();
            pointer.setNext(removedNode.getNext());
            if (pointer.getNext() == null) {
                tail = pointer;
            }
            size--;
            return removedNode.getData();
        }
    }
    
    /**
     * Removes and returns the first occurrence 
     * of the specified element in the list.
     *
     * @param element The element to remove.
     * @return The removed element.
     * @throws NoSuchElementException if the element is not found in the list.
     */
    public E remove(E element) {
        if (isEmpty()) {
            return null;
        }
    
        if (head.getData().equals(element)) {
            return removeHead();
        }
    
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null && !current.getData().equals(element)) {
            E temp = current.getData();
            System.out.println(temp.equals(element));
            System.out.println(temp);
            System.out.println(element);
            previous = current;
            current = current.getNext();
        }
    
        if (current == null) {
            return null;
        }
    
        previous.setNext(current.getNext());
        size--;
        return current.getData();
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
     * Returns the element at the specified index in the list.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public E get(int index) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp.getData();
    }
    
    
    /**
     * Sets the element at the specified index to the given element.
     *
     * @param index The index of the element to set.
     * @param element The new element to set.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public void set(int index, E element) throws NoSuchElementException {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.setData(element);
    }
    
    
    /**
     * Inserts an element into the list in sorted order 
     *
     * @param element The element to insert into the list.
     */
    public void insertSorted(E element) {
        Node<E> cur = head;
        int index = 0;
        while (cur != null && element.compareTo(cur.getData()) > 0) {
            cur = cur.getNext();
            index++;
        }
        add(index, element);
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
     * Returns a string representation of the linked list from head to tail
     *
     * @return A string list showing all the numbers in the linked list
     */
    public String toString() {
        String listString = "";
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            listString += temp.getData();
            temp = temp.getNext();
            if (i < size - 1) { //not if last element
                listString += ", ";
            }
        }
        return listString;
    }
}
