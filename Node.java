/**
 * Represents a node that can store data and link with other nodes.
 *
 * @author Joshua Zhang
 * @version 10/4/23
 */
public class Node<E> {
    private E data;
    private Node<E> next;

    /**
     * Constructs a node with the specified data.
     *
     * @param element The data to be stored in the node.
     */
    public Node(E element) {
        data = element;
    }

    /**
     * Gets the data stored in this node.
     *
     * @return The data stored in this node.
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the data to be stored in this node.
     *
     * @param element The data to be stored in this node.
     */
    public void setData(E element) {
        data = element;
    }

    /**
     * Gets the next node linked to this node.
     *
     * @return The next node linked to this node.
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Sets the next node to be linked to this node.
     *
     * @param element The next node to be linked to this node.
     */
    public void setNext(Node<E> element) {
        next = element;
    }
}
