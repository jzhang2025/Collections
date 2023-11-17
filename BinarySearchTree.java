
/**
 * Creates a Binary Search Tree data structure that can organize integers in 
 * nodes. Nodes can either be added to the left or right of another node
 * depending on if the integer is greater or less then the root. 
 *
 * @author Joshua Zhang
 * @version November 17
 */
public class BinarySearchTree<E extends Comparable<E>> 
{
    private BinarySearchTreeNode<E> root;
    private int size;
    
    public BinarySearchTree()
    {
        root = null;
        size = 0;    
    }

    /**
     * Inserts a new node into the tree and places it based off the integer 
     * value. 
     *
     * @param element The element to add.
     */
    public void insert(E element) {
        if (root == null) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
        }
        size++;
    }
    
    
    /**
     * Checks if the element provided is in the tree
     *
     * @return The element if it is in the tree and null if the provided 
     * element is not in the tree
     */
    public E search(E element) {
        return root.search(element);
    }
    
    /**
     * Searches for the smallest integer in the tree
     *
     * @return The smallest element in the tree and null if 
     * the tree is empty 
     */
    public E getMin() {
        if (root == null) {
            return null;
        } else {
            return root.getMin();
        }
    }
    
    /**
     * Searches for the largest integer in the tree
     *
     * @return The largest element in the tree and null if 
     * the tree is empty 
     */
    public E getMax() {
        if (root == null) {
            return null;
        } else {
            return root.getMax();
        }
    }
    
    /**
     * Checks if the Binary Search Tree is empty.
     *
     * @return True if the tree is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (root == null);
    }
    
    /**
     * Returns the number of elements in the tree
     *
     * @return the number of elements in the tree
     */
    public int size() {
        return size;
    }
}
