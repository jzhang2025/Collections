
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
    
    public E getMin() {
        if (left == null) { 
            return data;
        } else {
            return left.getMin();
        }
    }

    public E getMax() {
        if (right == null) { 
            return data;
        } else {
            return right.getMax();
        }
    }
}
