
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
    
    public E getData() {
        return data;
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
    
    /**
     * Returns the tree in string format from smallest to largest node
     *
     * @return the nodes in the tree from smallest to largest in string form
     */
    
    public String toString() {
        String listString = "";
        if (left != null) {
            listString += left.toString() + ", ";
        } 
        listString += data; 
        if (right != null) {
            listString += ", " + right.toString();
        }
        return listString;
    }
    
    /**
     * Returns the depth of the binary tree
     *
     * @return the depth of the tree
     */
    
    public int getDepth() {
        int depth = 1; 
        if (left == null && right == null) {
            return depth;
        } else if (left != null && (right == null 
        || left.getDepth() > right.getDepth())) {
            return depth + left.getDepth();
        } else {
            return depth + right.getDepth();
        }
            
    }
        
    /**
     * Removes and returns the given element from the binary tree. If the 
     * element is not in the tree the method returns null
     *
     * @return the removed node or null if the given element is not in the 
     * binary tree
     */
    
    public BinarySearchTreeNode remove(E element) {
         if (element.compareTo(data) < 0) {
            if (left == null) {
                return this;
            } else {
                left = left.remove(element);
                return this;
            }
        } else if (element.compareTo(data) > 0) {
            if (right == null) {
                return this;
            } else {
                right = right.remove(element);
                return this;
            }
        } else {
            if (left == null && right == null) {
                return null;
            } else if (left != null && right == null) {
                return left;
            } else {
                return right;
            }
        }
    }
}
