
/**
 * Represents a Binary Search Tree Node with the methods needed to make it work
 *
 * @author Joshua Zhang
 * @version November 17 2023
 */
public class BinarySearchTreeNode<E extends Comparable<E>> 
{
    private E data;
    private BinarySearchTreeNode<E> left;
    private BinarySearchTreeNode<E> right;
  
    public BinarySearchTreeNode(E element)
    {
        data = element;
    }
    
    /**
     * Inserts a new node into the tree and places it based off the integer 
     * value. Checks if the element provided is less than or more than the root. 
     *
     * @param element The element to add.
     */
    
    public void insert(E element) {
    if (element.compareTo(data) < 0) {
        if (left == null) {
            left = new BinarySearchTreeNode<>(element);
        } else {
            left.insert(element); 
        }
    } else if (element.compareTo(data) > 0) {
        if (right == null) {
            right = new BinarySearchTreeNode<>(element);
        } else {
            right.insert(element); 
        }
    }
    }
    
    /**
     * Checks if the element provided is in the tree and returns it. 
     *
     * @return The element if it is in the tree and null if the provided 
     * element is not in the tree
     */
    public E search(E element) {
    if (element.compareTo(data) == 0) {
        return data; 
    } else if (element.compareTo(data) < 0 && left != null) {
        return left.search(element); 
    } else if (element.compareTo(data) > 0 && right != null) {
        return right.search(element); 
    }
    return null;    
    }
    
    /**
     * Searches for the smallest integer in the tree
     *
     * @return The smallest element in the tree 
     */
    public E getMin() {
        if (left == null) { 
            return data;
        } else {
            return left.getMin();
        }
    }

    /**
     * Searches for the largest integer in the tree
     *
     * @return The largest element in the tree 
     */
    public E getMax() {
        if (right == null) { 
            return data;
        } else {
            return right.getMax();
        }
    }
}
