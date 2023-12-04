
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
    
    /**
     * Returns the tree in string format from smallest to largest node
     *
     * @return the nodes in the tree from smallest to largest in string form
     */
    
    public String toString() {
        return root.toString();
    }
    
    /**
     * Returns the depth of the binary tree
     *
     * @return the depth of the tree
     */
    
    public int getDepth() {
        return root.getDepth();
    }
    
    public void printTree() {
        root.printTree(3);
    }
    
    /**
     * Removes and returns the given element from the binary tree. If the 
     * element is not in the tree the method returns null
     *
     * @return the removed node or null if the given element is not in the 
     * binary tree
     */
    
    public E remove(E element) {
        if (root == null) {
            return null;
        } else if (search(element) == null) {
            return null;
        }
        E removed = root.search(element); 
        root = root.remove(element);
        size--;
        return removed;
    }
    
    /**
     * Removes and returns the smallest element in the Binary Search Tree
     *
     * @return the removed node 
     */ 
    
    public E removeMin() {
        if (isEmpty()) {
            return null;
        }
        E removeElement = root.getMin(); 
        root = root.removeMin();
        size--;
        return removeElement;
    }
    
    /**
     * Removes and returns the largest element in the Binary Search Tree
     *
     * @return the removed node 
     */
    
    public E removeMax() {
        if (isEmpty()) {
            return null;    
        }
        E removeElement = root.getMax(); 
        root = root.removeMax();
        size--;
        return removeElement;
    }
}
